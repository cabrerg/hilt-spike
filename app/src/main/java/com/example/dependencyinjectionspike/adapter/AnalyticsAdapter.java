package com.example.dependencyinjectionspike.adapter;

import com.example.dependencyinjectionspike.service.AnalyticsService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AnalyticsAdapter {

    private final AnalyticsService service;

    @Inject
    public AnalyticsAdapter(AnalyticsService service) {
        this.service = service;
    }

    public String getStatus() {
        return service.getStatus();
    }
}
