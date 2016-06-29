# Piciu
用于activity跳转

![enter image description here](http://photo.hanyu.iciba.com/upload/encyclopedia_2/32/93/s_bk_3293ff9c57b2794b04b7d728ea7820d3_vwVuPf.jpg)


####可以在内部设置activity跳转动画
####提供了3个动画接口和一个设置动画接口，通过设置透明度动画，平移动画，旋转动画，内部自动设置成组合动画，也可直接自己将写好的动画传进去

    Intent intent = new Intent(activity, PhotoBrowserActivity.class);
    intent.putExtra(PHOTO_LIST, photoList);
    intent.putExtra(Constant.PhotoBroAction.ACTION_KEY, actionKey);
    activity.startActivityForResult(intent, Constant.REQUEST_CODE);

以上代码将被替换为

    Piciu.go(activity,PhotoBrowserActivity.class)
                .putExtra(PHOTO_LIST,photoList)
                .putExtra(Constant.PhotoBroAction.ACTION_KEY,actionKey)
                .build();
