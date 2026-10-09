package com.octiq.fixture.api;

import com.octiq.fixture.core.Greeter;

public class GreetingService {
    private final Greeter greeter = new Greeter();

    public String welcome(String user) {
        return greeter.greet(user);
    }
}
