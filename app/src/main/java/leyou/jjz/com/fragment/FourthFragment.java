package leyou.jjz.com.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;

import leyou.jjz.com.R;
import leyou.jjz.com.adapt.CommonAdapter;
import leyou.jjz.com.adapt.ViewHolder;
import leyou.jjz.com.view.xlistview.XListView;

public class FourthFragment extends BaseFragment {

    private View view;
    private XListView xlistView;
    List list = Arrays.asList("", "", "", "");

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(activity, R.layout.fourthfragment, null);
        initView(view);
        return view;

    }

    private void initView(View view) {
        xlistView = (XListView) view.findViewById(R.id.xlistView);
        xlistView.setAdapter(new CommonAdapter<String>(activity,list,R.layout.fourthfragment_list_item) {
            @Override
            public void convert(ViewHolder holder, String s, int position) {
//                super.convert(holder, s, position);
            }
        });

    }
}
