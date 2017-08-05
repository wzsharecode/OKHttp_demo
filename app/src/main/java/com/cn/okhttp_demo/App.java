package com.cn.okhttp_demo;

import android.app.Application;

/**
 * Created by computer on 2017/7/31.
 */


public class App extends Application {
    private static App INSTANCE;

    public static App getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
