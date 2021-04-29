package com.example.dependencyinjectionspike.service;

public class StorageServiceImpl implements StorageService {

    @Override
    public String getStatus() {
        return "Online";
    }
}
