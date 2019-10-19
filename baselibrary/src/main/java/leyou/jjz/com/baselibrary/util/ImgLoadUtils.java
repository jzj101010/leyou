package leyou.jjz.com.baselibrary.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

public class ImgLoadUtils {
    public static void loadImg(Context context, String url, ImageView imageView, int defaultUrl){
        Glide.with(context)
                .load(url)
                .centerCrop()
                .placeholder(defaultUrl)
                .into(imageView);
    }
}
