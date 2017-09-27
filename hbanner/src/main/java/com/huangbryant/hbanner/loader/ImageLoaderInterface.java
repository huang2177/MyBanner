package com.huangbryant.hbanner.loader;

import android.content.Context;
import android.view.View;

import java.io.Serializable;


public interface ImageLoaderInterface<T extends View> extends Serializable {

    void displayImage(Context context, Object path, T imageView, int position);

    T createImageView(Context context);
}
