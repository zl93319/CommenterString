package com.bupa.stringutils;

import android.app.Application;

import com.bupa.stringutils.util.UIUtils;

/**
 * Created by Administrator on 2017/8/29 0029.
 */

public class GApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UIUtils.init(this);
    }
}
