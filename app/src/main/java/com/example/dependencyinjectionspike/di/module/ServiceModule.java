package com.example.dependencyinjectionspike.di.module;

import android.content.Context;

import com.example.dependencyinjectionspike.service.StorageService;
import com.example.dependencyinjectionspike.service.StorageServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class ServiceModule {

    @Provides
    @Singleton
    public StorageService storageService(@ApplicationContext Context appContext) {
        return new StorageServiceImpl(appContext);
    }
}
