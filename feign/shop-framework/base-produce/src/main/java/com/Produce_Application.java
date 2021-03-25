package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//注意！
@EnableEurekaClient
public class Produce_Application {
    public static void main(String[] args) {
        SpringApplication.run(Produce_Application.class, args);
    }
}
