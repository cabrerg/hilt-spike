package com.example.dependencyinjectionspike.di.module;



import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class ApplicationModule {
    // Some other providers common to the application.
}
