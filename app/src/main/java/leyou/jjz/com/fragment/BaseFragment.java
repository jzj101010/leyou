package leyou.jjz.com.fragment;

import android.content.Context;


import androidx.fragment.app.Fragment;

import leyou.jjz.com.activity.BaseActivity;


/**
 * Created by j on 2018/11/26 0026.
 */

public class BaseFragment extends Fragment {
    BaseActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity= (BaseActivity) context;
    }
}
