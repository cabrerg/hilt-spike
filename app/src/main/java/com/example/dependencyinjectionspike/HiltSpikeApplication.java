package com.example.dependencyinjectionspike;

import android.app.Application;

import com.example.dependencyinjectionspike.adapter.AnalyticsAdapter;
import com.example.dependencyinjectionspike.service.AnalyticsService;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;


@HiltAndroidApp
public final class HiltSpikeApplication extends Application {

    @Inject
    AnalyticsService service;

    @Override
    public void onCreate() {
        super.onCreate();
        // We might want to track some actions here by using analytics service.
    }
}