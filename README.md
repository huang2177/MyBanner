# 引入
- 1.0 将下面代码添加到项目的根目录的build.gradle： 
```
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```
- 2.0 将下面代码添加到app目录的build.gradle： 
```
dependencies { 
     compile 'com.github.huangbryant210707:MyBanner:2.4.0'
}
```

# 使用 

```
 mBanner.setVisibility(View.VISIBLE);
            mBanner.setBannerStyle(HBannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
            //设置图片加载器
            mBanner.setImageLoader(new GlideImageLoader());
            //设置图片集合
            mBanner.setImages(mListImg);
            //设置标签显示与否
            mBanner.setImagesTag(mListTag, R.drawable.icon_free);
            //设置banner动画效果
            mBanner.setBannerAnimation(Transformer.Accordion);
            //设置标题集合（当banner样式有显示title时）
            mBanner.setBannerTitles(mListTitle);
            //设置自动轮播，默认为true
            mBanner.isAutoPlay(true);
            //设置轮播时间
            mBanner.setDelayTime(3000);
            //设置指示器位置（当banner模式中有指示器时）
            mBanner.setIndicatorGravity(HBannerConfig.RIGHT);
            //banner设置方法全部调用完毕时最后调用
            mBanner.start();
            
        public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(context).load(path).into(imageView);
        }

        @Override
        public TagImageView createTagImageView(Context context) {
            TagImageView tagImageView = new TagImageView(context);
            return tagImageView;
        }

        @Override
        public ImageView createImageView(Context context) {
            return null;
        }
```
