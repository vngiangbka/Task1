package com.product.ygd.task1;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.product.ygd.task1.utils.LocaleHelper;

public class App extends Application {
    private static App sInstance;
    private Gson mGSon;

    public static App self() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        mGSon = new Gson();
    }

    public Gson getGSon() {
        return mGSon;
    }
}

