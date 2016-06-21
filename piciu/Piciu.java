package com.example.administrator.watchphotodemo.piciu;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Zoi.
 * E-mail：KyluZoi@gmail.com
 * 2016/6/21
 */
public class Piciu{

    static volatile Piciu singleton = null;
    final Activity mGoActivity;
    final Class<?> mToActivity;
    Intent intent;

    public Piciu(Activity fromActivity,Class<?> toActivity)
    {
        mGoActivity=fromActivity;
        mToActivity=toActivity;
        intent=new Intent(mGoActivity,mToActivity);
    }


    /**
     * 设置需要跳转的两个activity
     * @param fromActivity
     * @param toActivity
     * @return
     */
    public static Piciu go(Activity fromActivity,Class<?> toActivity)
    {
        singleton = new PiciuBuilder(fromActivity,toActivity).build();
        return singleton;
    }




    /**
     * Piciu的建造者
     */
    static class PiciuBuilder
    {
        final Activity mGoActivity;
        final Class<?> mToActivity;
        PiciuBuilder(Activity fromActivity,Class<?> toActivity)
        {
            mGoActivity=fromActivity;
            mToActivity=toActivity;
        }
        public Piciu build()
        {
            // TODO: 2016/6/21 预留建造者处理activity或intent
            return new Piciu(mGoActivity,mToActivity);
        }

    }


    /**
     * 预留建造者的指挥者
     */
    class Direct
    {

    }

    /**
     * 预留桥梁接口
     */
    interface Approach
    {

    }
}
