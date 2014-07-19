package com.example.dropwizard;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

public class SampleConfiguration extends Configuration {
    @NotEmpty
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
