package com.acme.ext;

import com.acme.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    public String greet() {
        return "Hello World";
    }
}
