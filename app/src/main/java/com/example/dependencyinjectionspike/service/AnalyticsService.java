package com.example.dependencyinjectionspike.service;

import android.content.Context;

import javax.inject.Inject;
import dagger.hilt.android.qualifiers.ApplicationContext;

public class AnalyticsService {

    private final Context appContext;
    private final StorageService storageService;

    @Inject
    public AnalyticsService(@ApplicationContext Context appContext, StorageService storageService) {
        this.appContext = appContext;
        this.storageService = storageService;
    }

    public String getStatus() {
        return storageService.getStatus();
    }
}
