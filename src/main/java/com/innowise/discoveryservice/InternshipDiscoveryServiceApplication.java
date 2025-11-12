package com.innowise.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InternshipDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternshipDiscoveryServiceApplication.class, args);
    }

}
