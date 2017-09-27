package com.huangbryant.hbanner.loader;

import android.content.Context;
import android.view.View;

import com.huangbryant.hbanner.view.TagImageView;

import java.io.Serializable;


public interface ImageLoaderInterface<T extends View> extends Serializable {

    void displayImage(Context context, Object path, T imageView);

    T createImageView(Context context);

    TagImageView createTagImageView(Context context);
}
