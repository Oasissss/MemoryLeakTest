package com.example.memoryleak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

import java.lang.ref.WeakReference;

public class HandlerActivity extends AppCompatActivity {

    class MyHandler extends Handler {


        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 0){

            }
        }
    }

    private MyHandler mHandler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        final Handler handler = new MyHandler();
        new Thread(){
            @Override
            public void run() {
                super.run();
                SystemClock.sleep(20000);
                handler.sendEmptyMessage(0);
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}