package leyou.jjz.com.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

import leyou.jjz.com.adapt.CommonAdapter;
import leyou.jjz.com.adapt.ViewHolder;
import leyou.jjz.com.R;
import leyou.jjz.com.baselibrary.util.ImgLoadUtils;
import leyou.jjz.com.view.xlistview.XListView;

public class FirstFragment extends BaseFragment implements View.OnClickListener {

    View view;
    private XListView xlistView;
    private View headView;
    private CommonAdapter commonAdapter;
    List list = Arrays.asList("", "", "", "");
    private ImageView im_top;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.firstfragment, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        xlistView = (XListView) view.findViewById(R.id.xlistView);
        headView = View.inflate(activity, R.layout.firstfragment_head, null);
        xlistView.addHeaderView(headView);
        xlistView.setPullLoadEnable(false);

        commonAdapter = new CommonAdapter(activity, list, R.layout.firstfragment_list_item) {
            @Override
            public void convert(ViewHolder holder, Object o, int position) {
                super.convert(holder, o, position);
            }
        };
        xlistView.setAdapter(commonAdapter);

        im_top = (ImageView) view.findViewById(R.id.im_top);
        ImgLoadUtils.loadImg(getContext(),"http://image",im_top,R.drawable.ic_launcher_background);
    }

    @Override
    public void onClick(View v) {

    }
}
