package com.guaju.devlib;


/**
 * Created by guaju on 2017/10/30.
 * 单例模式
 */

public class SingletonMode2 {
    // 用的时候再创建变量--->懒汉式
    private static SingletonMode2 sm;
    private static final String TAG = "SingletonMode";
//    如何保证只能创建一个实例？
//    如何让大家拿到我这个实例?

    //私有化我们的构造方法
    private SingletonMode2(){
        //do some thing
       System.out.println( "SingletonMode: 构造方法" );
    }
    //准备一个方法，让别的类获得这个实例
    public static SingletonMode2 getInstance(){
        if (sm==null){
            System.out.println("我要创建线程了");
            sm=new SingletonMode2();
        }

        return sm;
    }



}
