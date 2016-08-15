package com.person.kyluzoi.piciu;

/**
 * Created by Zoi.
 * E-mail：KyluZoi@gmail.com
 * 2016/6/29
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;


public class PiciuBuilder implements Intentable
{
    final Activity mGoActivity;
    final Class<?> mToActivity;
    private Intent mIntent;
    PiciuBuilder(Activity fromActivity,Class<?> toActivity)
    {
        mGoActivity=fromActivity;
        mToActivity=toActivity;
        mIntent=new Intent(mGoActivity,mToActivity);
    }
    public Piciu start()
    {
        return new Piciu(mGoActivity,mToActivity,mIntent);
    }


    public Piciu start(int resultCode)
    {
        return new Piciu(mGoActivity,mToActivity,mIntent,resultCode);
    }






    @Override
    public PiciuBuilder putExtra(String name, boolean value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, boolean[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, Bundle value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, byte value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, byte[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, char value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, char[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, CharSequence value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, CharSequence[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, double value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, double[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, float value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, float[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, int value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, int[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, long value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, long[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, Parcelable value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, Parcelable[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, Serializable value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, short value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, short[] value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, String value) {
        mIntent.putExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtraInteger(String name, ArrayList<Integer> value) {
        mIntent.putIntegerArrayListExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtra(String name, ArrayList<? extends Parcelable> value) {
        mIntent.putParcelableArrayListExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtraArrayListString(String name, ArrayList<String> value) {
        mIntent.putStringArrayListExtra(name,value);
        return this;
    }

    @Override
    public PiciuBuilder putExtraArrCharSequence(String name, ArrayList<CharSequence> value) {
        mIntent.putCharSequenceArrayListExtra(name,value);
        return this;
    }
}
