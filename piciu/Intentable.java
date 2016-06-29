package com.example.administrator.watchphotodemo.piciu;

import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Zoi.
 * E-mail：KyluZoi@gmail.com
 * 2016/6/29
 */
public interface Intentable {
    PiciuBuilder putExtra(String name,boolean value);
    PiciuBuilder putExtra(String name,boolean[] value);
    PiciuBuilder putExtra(String name,Bundle value);
    PiciuBuilder putExtra(String name,byte value);
    PiciuBuilder putExtra(String name,byte[] value);
    PiciuBuilder putExtra(String name,char value);
    PiciuBuilder putExtra(String name,char[] value);
    PiciuBuilder putExtra(String name,CharSequence value);
    PiciuBuilder putExtra(String name,CharSequence[] value);
    PiciuBuilder putExtra(String name,double value);
    PiciuBuilder putExtra(String name,double[] value);
    PiciuBuilder putExtra(String name,float value);
    PiciuBuilder putExtra(String name,float[] value);
    PiciuBuilder putExtra(String name,int value);
    PiciuBuilder putExtra(String name,int[] value);
    PiciuBuilder putExtra(String name,long value);
    PiciuBuilder putExtra(String name,long[] value);
    PiciuBuilder putExtra(String name,Parcelable value);
    PiciuBuilder putExtra(String name,Parcelable[] value);
    PiciuBuilder putExtra(String name,Serializable value);
    PiciuBuilder putExtra(String name,short value);
    PiciuBuilder putExtra(String name,short[] value);
    PiciuBuilder putExtra(String name,String value);
    PiciuBuilder putExtraInteger(String name,ArrayList<Integer> value);
    PiciuBuilder putExtra(String name,ArrayList<? extends Parcelable> value);
    PiciuBuilder putExtraArrayListString(String name,ArrayList<String> value);
    PiciuBuilder putExtraArrCharSequence(String name,ArrayList<CharSequence> value);

}
