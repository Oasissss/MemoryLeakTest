package com.example.memoryleak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);

        TextView tv = (TextView) findViewById(R.id.InstanceLeak);

        AppManager.getInstance(this).setTv(tv);

    }
}