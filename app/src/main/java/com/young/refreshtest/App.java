package com.young.refreshtest;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRefreshLayout();
    }

    private void initRefreshLayout() {
        YoungRefreshLayout.init();
    }
}
