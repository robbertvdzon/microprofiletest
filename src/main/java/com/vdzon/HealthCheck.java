package com.vdzon;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Health
@ApplicationScoped
public class HealthCheck implements org.eclipse.microprofile.health.HealthCheck {
    public HealthCheckResponse call() {
      return HealthCheckResponse
              .named("mytest")
              .up()
              .build();
    }
}
