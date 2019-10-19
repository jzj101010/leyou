package leyou.jjz.com.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leyou.jjz.com.R;

public class SecondFragment extends BaseFragment {

    private View view;
    private LinearLayout li_scroll;
    List list = Arrays.asList("为您推荐", "女装", "男装", "美妆个护");
     List<TextView> textViews=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.secondfragment, null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        li_scroll = (LinearLayout) view.findViewById(R.id.li_scroll);
        for (int i = 0; i <list.size() ; i++) {
            TextView textView=new TextView(activity);
            textView.setGravity(Gravity.CENTER);
            textView.setText((String) list.get(i));
            textView.setPadding(20,20,20,20);
            textViews.add(textView);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < textViews.size(); j++) {
                        if(v==textViews.get(j)){
                            textViews.get(j).setBackgroundColor(0xffdcdcdc);
                        }  else {
                            textViews.get(j).setBackgroundColor(0xffffffff);
                        }
                    }

                }
            });
            if(i==0){
                textView.setBackgroundColor(0xffdcdcdc);
            }
            li_scroll.addView(textView);
        }
    }
}
