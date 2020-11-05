package com.example.memoryleak;

import android.content.Context;
import android.widget.TextView;

public class AppManager {
    private static AppManager instance;
    private Context context;
    private TextView tv;


    private AppManager(Context context) {
        this.context = context;
    }

    public static AppManager getInstance(Context context) {
        if (instance == null) {
            instance = new AppManager(context);
        }
        return instance;
    }

    public void setTv(TextView tv){
        this.tv = tv;
        tv.setText(context.getString(R.string.app_name));
    }


}
