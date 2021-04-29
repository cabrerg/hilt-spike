package com.example.dependencyinjectionspike.service;

import android.content.Context;

import javax.inject.Inject;

public class AnalyticsService {

    private final Context appContext;
    private final StorageService storageService;

    public AnalyticsService(Context appContext, StorageService storageService) {
        this.appContext = appContext;
        this.storageService = storageService;
    }

    public String getStatus() {
        return storageService.getStatus();
    }
}
