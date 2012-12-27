package com.cm.ingress.ai;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.cm.ingress.ai.untils.CommonUtils;

public class IngressAIApp extends Application {
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        Context context = getApplicationContext();
        
        Log.d("Debug", "onCreate");

        
        CommonUtils.init(context);
    }
}
