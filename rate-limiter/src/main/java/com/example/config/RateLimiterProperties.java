package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

import jakarta.annotation.sql.DataSourceDefinition;



@Data
@Component
@ConfigurationProperties(prefix="rate-limiter")
public class RateLimiterProperties {
    private long capacity=10,refillrate=5;
    private String apiServerUrl="http://localhost:8080";
    private int timeout=2000;
     

}