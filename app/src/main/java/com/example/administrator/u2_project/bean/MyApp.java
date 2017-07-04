package com.example.administrator.u2_project.bean;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/6/5.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
