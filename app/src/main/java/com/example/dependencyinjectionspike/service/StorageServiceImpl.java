package com.example.dependencyinjectionspike.service;

import android.content.Context;

public class StorageServiceImpl implements StorageService {

    private final Context appContext;

    public StorageServiceImpl(final Context appContext) {
        this.appContext = appContext;
    }

    @Override
    public String getStatus() {
        return "Online";
    }
}
