package com.harrison.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HarrisonEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HarrisonEurekaApplication.class, args);
    }

}
