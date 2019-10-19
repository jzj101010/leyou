package leyou.jjz.com;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


import androidx.fragment.app.Fragment;

import com.hxb.easynavigition.view.EasyNavigitionBar;

import java.util.ArrayList;
import java.util.List;

import leyou.jjz.com.activity.BaseActivity;
import leyou.jjz.com.fragment.FirstFragment;
import leyou.jjz.com.fragment.FiveFragment;
import leyou.jjz.com.fragment.FourthFragment;
import leyou.jjz.com.fragment.SecondFragment;
import leyou.jjz.com.fragment.ThirdFragment;
import leyou.jjz.com.R;

public class MainActivity extends BaseActivity {
    private String[] tabText = {"首页", "分类", "优选", "收藏", "我的"};
    //未选中icon
    private int[] normalIcon = {R.mipmap.uncheck, R.mipmap.uncheck, R.mipmap.uncheck, R.mipmap.uncheck, R.mipmap.uncheck};
    //选中时icon
    private int[] selectIcon = {R.mipmap.check, R.mipmap.check, R.mipmap.check, R.mipmap.check, R.mipmap.check};

    private List<Fragment> fragments = new ArrayList<>();
    private EasyNavigitionBar navigitionBar;
    private TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());
        fragments.add(new FourthFragment());
        fragments.add(new FiveFragment());

        initView();
    }

    private void initView() {


        //https://github.com/hexingbo/EasyNavigition
        navigitionBar = findViewById(R.id.navigitionBar);
        navigitionBar.titleItems(tabText)
                .normalIconItems(normalIcon)
                .selectIconItems(selectIcon)
                .fragmentList(fragments)
                .fragmentManager(getSupportFragmentManager())
                .navigitionHeight(60)
                .canScroll(true)
//                .smoothScroll(true)
                .iconSize(25)
                .tabTextSize(10)
                .build();
        tv_login = (TextView) findViewById(R.id.tv_login);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    public void login() {

//        final AlibcLogin alibcLogin = AlibcLogin.getInstance();
//
//        alibcLogin.showLogin(MainActivity.this, new AlibcLoginCallback() {
//
//            @Override
//            public void onSuccess() {
//                //获取淘宝用户信息
//                Toast.makeText(MainActivity.this, "获取淘宝用户信息: " + AlibcLogin.getInstance().getSession(),
//                        Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(int code, String msg) {
//                Toast.makeText(MainActivity.this, "登录失败 " + code,
//                        Toast.LENGTH_LONG).show();
//            }
//        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        CallbackContext.onActivityResult(requestCode, resultCode, data);
//    }
}
