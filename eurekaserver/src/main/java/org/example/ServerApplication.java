package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yuankai Yang
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}