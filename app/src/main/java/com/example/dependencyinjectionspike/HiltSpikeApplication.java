package com.example.dependencyinjectionspike;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;


@HiltAndroidApp
public final class HiltSpikeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}