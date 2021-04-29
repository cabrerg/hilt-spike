package com.example.dependencyinjectionspike.di.module;

import android.content.Context;

import com.example.dependencyinjectionspike.service.AnalyticsService;
import com.example.dependencyinjectionspike.service.StorageService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class ApplicationModule {

    @Provides
    public static Context context(@ApplicationContext Context appContext) {
        return appContext;
    }
}
