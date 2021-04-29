package com.example.dependencyinjectionspike;

import android.content.Context;

import com.example.dependencyinjectionspike.service.AnalyticsService;
import com.example.dependencyinjectionspike.service.StorageService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnalyticsServiceTest {
    private static final String FAKE_STATUS = "HELLO WORLD";

    @Mock
    private Context mockContext;

    @Mock
    private StorageService storageService;

    private AnalyticsService analyticsService;

    @Before
    public void setUp() {
        this.analyticsService = new AnalyticsService(mockContext, storageService);
    }

    @Test
    public void shouldReturnStatus() {
        when(storageService.getStatus()).thenReturn(FAKE_STATUS);

        String result = analyticsService.getStatus();

        Assert.assertEquals("hola", result, FAKE_STATUS);
    }
}
