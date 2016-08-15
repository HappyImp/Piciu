package com.person.kyluzoi.piciu;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Zoi.
 * E-mail：KyluZoi@gmail.com
 * 2016/6/21
 */
public class Piciu {

    static volatile PiciuBuilder singleton = null;
    final Activity mGoActivity;
    final Class<?> mToActivity;
    Intent intent;

    public Piciu(Activity fromActivity, Class<?> toActivity, Intent intent) {
        mGoActivity = fromActivity;
        mToActivity = toActivity;
        this.intent = intent;
        mGoActivity.startActivity(intent);
    }

    public Piciu(Activity fromActivity, Class<?> toActivity, Intent intent,int resultCode) {
        mGoActivity = fromActivity;
        mToActivity = toActivity;
        this.intent = intent;
        mGoActivity.startActivityForResult(intent,resultCode);
    }



    public static PiciuBuilder go(Activity fromActivity, Class<?> toActivity) {
        singleton = new PiciuBuilder(fromActivity, toActivity);
        return singleton;
    }



    class Direct {

    }


    interface Approach {

    }
}
