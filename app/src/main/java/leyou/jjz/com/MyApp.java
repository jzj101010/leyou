package leyou.jjz.com;

import android.app.Application;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import leyou.jjz.com.utils.ToastUtils;
import okhttp3.OkHttpClient;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        MultiDex.install(this);
//        AlibcTradeSDK.asyncInit(this, new AlibcTradeInitCallback() {
//            @Override
//            public void onSuccess() {
//                //初始化成功，设置相关的全局配置参数
//                ToastUtils.showToas("初始化成功");
//            }
//
//            @Override
//            public void onFailure(int code, String msg) {
//                //初始化失败，可以根据code和msg判断失败原因，详情参见错误说明
//                ToastUtils.showToas("初始化失败");
//
//            }
//        });


    }
}
