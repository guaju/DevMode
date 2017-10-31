package com.guaju.devmode.designmode;

import android.util.Log;

/**
 * Created by guaju on 2017/10/30.
 * 单例模式
 */

public class SingletonMode {
    // 先创建变量--->饿汉式
    private static SingletonMode sm=new SingletonMode();
    private static final String TAG = "SingletonMode";
//    如何保证只能创建一个实例？
//    如何让大家拿到我这个实例?

    //私有化我们的构造方法
    private SingletonMode(){
        //do some thing
        Log.e(TAG, "SingletonMode: 构造方法" );
    }
    //准备一个方法，让别的类获得这个实例
    public static SingletonMode getInstance(){
         return sm;
    }



}
