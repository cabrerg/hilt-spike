package com.example.dependencyinjectionspike.di.module;

import android.content.Context;

import com.example.dependencyinjectionspike.service.AnalyticsService;
import com.example.dependencyinjectionspike.service.StorageService;
import com.example.dependencyinjectionspike.service.StorageServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class ServiceModule {

    @Provides
    @Singleton
    public StorageService storageService() {
        return new StorageServiceImpl();
    }

    @Provides
    @Singleton
    public static AnalyticsService analyticsService(Context appContext, StorageService storageService) {
        return new AnalyticsService(appContext, storageService);
    }
}
