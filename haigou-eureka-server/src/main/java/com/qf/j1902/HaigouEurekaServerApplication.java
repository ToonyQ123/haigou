package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HaigouEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaigouEurekaServerApplication.class, args);
    }

}
