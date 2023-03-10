package com.example.demo.service;

import com.example.demo.model.DemoClass;

public interface GreetingsService {
    DemoClass getGreetingsMessage(long id, String name);
}
