package com.example.llw.demo_call_jni.jni;

/**
 * Created by llw on 2016/2/29.
 */
public class JNI {

    static {
        System.loadLibrary("hello_jni");
    }

    public static native String hellofromc();
}
