package leyou.jjz.com.fragment;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import leyou.jjz.com.R;

public class ThirdFragment extends BaseFragment {


    private View view;
    private GridLayout gl_grid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = View.inflate(activity, R.layout.thirdfragment, null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        gl_grid = (GridLayout) view.findViewById(R.id.gl_grid);
        gl_grid.post(new Runnable() {
            @Override
            public void run() {
                int wi=gl_grid.getWidth();
                for (int i = 0; i <9 ; i++) {
                    TextView textView=new TextView(activity);
                    textView.setText("title");
                    textView.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.icon),null,null);
                    textView.setGravity(Gravity.CENTER);
                    GridLayout.LayoutParams layoutParams=new GridLayout.LayoutParams();
                    layoutParams.width=wi/3;
                    layoutParams.setMargins(10,10,10,10);
                    textView.setLayoutParams(layoutParams);

                    gl_grid.addView(textView);
                }
            }
        });


    }
}
