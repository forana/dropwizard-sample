package com.example.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.example.dropwizard.healthchecks.HelloCheck;
import com.example.dropwizard.resources.HelloResource;

public class SampleApplication extends Application<SampleConfiguration> {
    public static void main(String[] args) throws Exception {
        new SampleApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment)
            throws Exception {
        environment.jersey().register(
                new HelloResource(
                        configuration.getGreeting()));
        environment.healthChecks().register("hello", new HelloCheck());
    }
}
