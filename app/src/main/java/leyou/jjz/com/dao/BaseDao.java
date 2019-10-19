package leyou.jjz.com.dao;

import android.content.Context;
import android.widget.Toast;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import leyou.jjz.com.utils.ToastUtils;
import leyou.jjz.com.view.ProgressDialog;
import okhttp3.Call;

public class BaseDao implements BusinessResponse {
    protected Context mContext;
    protected List<BusinessResponse> businessResponses = new ArrayList<BusinessResponse>();

    public BaseDao(Context mContext) {
        this.mContext = mContext;
    }
    public void post(final String url, Map map,StringCallback stringCallback){
        OkHttpUtils.post().url(url).params(map).build().execute(stringCallback);
    }
    public void get(final String url, Map map,StringCallback stringCallback){
        OkHttpUtils.get().url(url).params(map).build().execute(stringCallback);
    }
    public void post(final String url, Map map){
        OkHttpUtils.post().url(url).params(map).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }
            @Override
            public void onResponse(String response, int id) {
				try {
					JSONObject jsonObject = new JSONObject(response);
					BaseDao.this.callbak(jsonObject,"");
					BaseDao.this.OnMessageResponse(url, jsonObject);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
    public void get(final String url, Map map){
        OkHttpUtils.get().url(url).params(map).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }
            @Override
            public void onResponse(String response, int id) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    BaseDao.this.callbak(jsonObject,"");
                    BaseDao.this.OnMessageResponse(url, jsonObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void callbak(JSONObject jo, String s) {

                if (jo == null) {
//                    ToastView toast = new ToastView(mContext, "网络错误，请检查网络设置");
//                    toast.setGravity(Gravity.CENTER, 0, 0);
//                    toast.show();
                    ToastUtils.showToas("网络错误，请检查网络设置");
                    return;
                }

    }

    @Override
    public void OnMessageResponse(String url, JSONObject jo) throws JSONException {
        for (BusinessResponse businessResponse : businessResponses) {
            businessResponse.OnMessageResponse(url, jo);
        }

    }
}
