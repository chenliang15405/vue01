package com.miniplay.miniplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/*
    eureka 中将改服务注册到注册中心中，可以被发现和调用
    feign是将这个服务变为consumer端，可以来调用别的微服务，获取到数据，其他的只是eureka，并不是feign的微服务，就作为provider端
 */
@SpringBootApplication
@EnableDiscoveryClient   //启用eureka的客户端的注解
@EnableZuulProxy     //启动zuul
public class MiniPlayEurekaClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniPlayEurekaClientZuulApplication.class, args);
    }

}

