package com.miniplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启euraka的服务端
public class MiniplayEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniplayEurekaServerApplication.class, args);
    }

}

