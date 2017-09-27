package com.huangbryant.hbanner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.huangbryant.hbanner.transformer.AccordionTransformer;
import com.huangbryant.hbanner.transformer.BackgroundToForegroundTransformer;
import com.huangbryant.hbanner.transformer.CubeInTransformer;
import com.huangbryant.hbanner.transformer.CubeOutTransformer;
import com.huangbryant.hbanner.transformer.DefaultTransformer;
import com.huangbryant.hbanner.transformer.DepthPageTransformer;
import com.huangbryant.hbanner.transformer.FlipHorizontalTransformer;
import com.huangbryant.hbanner.transformer.FlipVerticalTransformer;
import com.huangbryant.hbanner.transformer.ForegroundToBackgroundTransformer;
import com.huangbryant.hbanner.transformer.RotateDownTransformer;
import com.huangbryant.hbanner.transformer.RotateUpTransformer;
import com.huangbryant.hbanner.transformer.ScaleInOutTransformer;
import com.huangbryant.hbanner.transformer.StackTransformer;
import com.huangbryant.hbanner.transformer.TabletTransformer;
import com.huangbryant.hbanner.transformer.ZoomInTransformer;
import com.huangbryant.hbanner.transformer.ZoomOutSlideTransformer;
import com.huangbryant.hbanner.transformer.ZoomOutTranformer;


public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
