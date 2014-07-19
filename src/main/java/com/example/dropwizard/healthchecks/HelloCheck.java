package com.example.dropwizard.healthchecks;

import com.codahale.metrics.health.HealthCheck;

/**
 * Example dummy healthcheck.
 */
public class HelloCheck extends HealthCheck {
    protected Result check() {
        // Normally there'd be some way for this to fail
        return Result.healthy();
    }
}
