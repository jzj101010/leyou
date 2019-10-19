package leyou.jjz.com.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.qmuiteam.qmui.util.QMUIWindowHelper;

import leyou.jjz.com.utils.ActivityManager;
import leyou.jjz.com.view.ProgressDialog;


/**
 * Created by j on 2018/11/22 0022.
 */

public class BaseActivity extends AppCompatActivity {
    protected ProgressDialog myProgressDialog ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        myProgressDialog = new ProgressDialog(this, "请稍等");
        super.onCreate(savedInstanceState);
        ActivityManager.getInstance().addActivity(this);
    }


    @Override
    protected void onDestroy() {
        myProgressDialog.dismiss();
        ActivityManager.getInstance().removeActivity(this);
        super.onDestroy();

    }


    /**
     * 判断是否是连续点击了Button
     *
     * @return true    连续点击了Button
     * false   没有连续点击Button
     */
    private long preTime;
    // 默认两次点击的间隔为 1000 毫秒
    public boolean isDoubleClick(){
        return isDoubleClick(1000);
    }
    public boolean isDoubleClick(int delaySecond) {
        long lastTime = System.currentTimeMillis();
        boolean flag = lastTime - preTime < delaySecond ? true : false;
        preTime = lastTime;
        return flag;
    }
}
