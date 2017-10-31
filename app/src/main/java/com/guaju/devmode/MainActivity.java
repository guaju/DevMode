package com.guaju.devmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guaju.devmode.bean.Home;
import com.guaju.devmode.httputil.CustomCallBack;
import com.guaju.devmode.httputil.OkHttpUtils;

import java.io.IOException;

import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
     static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        OkHttpUtils.getInstance().getBean("https://www.baidu.com", null, new CustomCallBack(Home.class) {
//            @Override
//            public void onMyResponse(Response response, Class clazz) {
//                try {
//                    String string = response.body().string();
//                    //把string转成bean     from to
//
//                    Home h = (Home) OkHttpUtils.gson.fromJson(string, clazz);
//
//                    //to do
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
        OkHttpUtils.getInstance().postBean("https://www.baidu.com", null,
                new CustomCallBack(Home.class) {
            @Override
            public void onMyResponse(Response response, Class clazz) {
                try {
                    String string = response.body().string();
                    //把string转成bean     from to

                    Home h = (Home) OkHttpUtils.gson.fromJson(string, clazz);

                    //to do

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



//        OkHttpUtils.getInstance().getString("https://www.baidu.com/", new StringCallBack() {
//            @Override
//            public void provideData(String str) {
//                Log.e(TAG, "provideData: "+str );
//            }
//        });
//        OkHttpUtils.getInstance().postString("https://www.baidu.com/", null, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.e(TAG, "onResponse: "+e.getMessage() );
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                if ( response.isSuccessful()){
//                    String string = response.body().string();
//                    Log.e(TAG, "onResponse: "+string );
//                }else{
//                    Log.e(TAG, "onResponse: "+response.body().string() );
//                }
//            }
//        });



    }
}
