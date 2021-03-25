package com.mybatis_plus2.mybatis_plus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//test。。。。。
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class MybatisPlus2Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus2Application.class, args);
    }

}
