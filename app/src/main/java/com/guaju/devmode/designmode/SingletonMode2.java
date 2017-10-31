package com.guaju.devmode.designmode;

import android.util.Log;

/**
 * Created by guaju on 2017/10/30.
 * 单例模式
 */

public class SingletonMode2 {
    // 用的时候再创建变量--->懒汉式
    private static volatile  SingletonMode2 sm;
    private static final String TAG = "SingletonMode";
//    如何保证只能创建一个实例？
//    如何让大家拿到我这个实例?

    //私有化我们的构造方法
    private SingletonMode2(){
        //do some thing
        Log.e(TAG, "SingletonMode: 构造方法" );
    }
    //准备一个方法，让别的类获得这个实例
    public static SingletonMode2 getInstance(){
        //synchronized 意思让被包围的范围变为同步
        if (sm==null){
        synchronized (SingletonMode2.class){
            Log.e(TAG, "执行了同步代码块" );
        if (sm==null){
            Log.e("Hehehe","我要创建线程了");
            sm=new SingletonMode2();
        }
        }
        }
        return sm;
    }



}
