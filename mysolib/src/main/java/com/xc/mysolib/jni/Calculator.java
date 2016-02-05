package com.xc.mysolib.jni;

/**
 * Created by caizhiming on 2016/2/5.
 */
public class Calculator {


    public native int add(int a,int b);
    public native int sub(int a,int b);
    public native void set(String str);
    public native String get();
}
