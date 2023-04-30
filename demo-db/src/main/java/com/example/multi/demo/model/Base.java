package com.example.multi.demo.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class Base {
    private String createdAt;

    public Base(){
        this.initialize();
    }

    private void initialize(){
        String now = Timestamp.valueOf(LocalDateTime.now()).toString();
        this.createdAt = now;
    }
}
