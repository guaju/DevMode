package com.guaju.devlib;

public class myClass {

   static int flag=0;

    public static void main(String[] args) {
      //模拟多线程并发
        while (flag<100){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    flag++;
                    SingletonMode2 instance = SingletonMode2.getInstance();

                }
            }).start();
        }
    }
}
