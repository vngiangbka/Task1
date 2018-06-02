package com.product.ygd.task1;

import android.app.Application;
import android.content.Context;

import com.product.ygd.task1.Helper.LocaleHelper;

public class MainApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }
}
