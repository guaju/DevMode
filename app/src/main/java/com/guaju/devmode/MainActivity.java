package com.guaju.devmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guaju.devmode.qiniu.QiniuUtils;
import com.orhanobut.logger.Logger;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
     static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path="http://guaju.butterfly.mopaasapp.com/MyServlet";
        HashMap<String, String> map = new HashMap<>();
        map.put("user_name","laowang2");
        map.put("password","12345");
        //上传一个图片到7牛云
        try {
            String token = QiniuUtils.calcToken("heihei.png");
            Logger.e(token);

            QiniuUtils.uploadPicWithProgress("/sdcard/Download/heihei.png","heihei.png",token);


        } catch (Exception e) {
            Logger.e(e.getMessage());
            e.printStackTrace();
        }




    }
}
