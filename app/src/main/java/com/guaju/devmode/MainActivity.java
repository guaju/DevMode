package com.guaju.devmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guaju.devmode.bean.User;
import com.guaju.devmode.httputil.CustomCallBack;
import com.guaju.devmode.httputil.OkHttpUtils;
import com.orhanobut.logger.Logger;

import java.io.IOException;

import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
     static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path="http://127.0.0.1:8080/hello.html";
        String path2="http://localhost:8080/hello.html";
        String path3="http://192.168.38.226/hello.html";
        String path4="https://www.baidu.com";


        OkHttpUtils.getInstance().getBean(path3, null, new CustomCallBack(User.class) {
            @Override
            public void onMyResponse(Response response, Class clazz) {
                try {
                    String json = response.body().string();
                   User user= (User) OkHttpUtils.gson.fromJson(json,clazz);

                    String username = user.getData().getUsername();
                    Logger.e("onMyResponse: "+username );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
