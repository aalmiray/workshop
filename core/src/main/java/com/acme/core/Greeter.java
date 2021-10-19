package com.acme.core;

import com.acme.api.GreetingService;

import java.util.ServiceLoader;

public class Greeter {
    public void greet() {
        ServiceLoader.load(GreetingService.class)
            .forEach(service -> System.out.println(service.greet()));
    }
}
