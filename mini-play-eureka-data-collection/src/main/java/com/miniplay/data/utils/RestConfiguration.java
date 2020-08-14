package com.miniplay.data.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Http请求配置类-springboot内置
 * 配置restTemplate通过configuration注解可以配置。在系统启动之前就已经加载这个配置
 * @auther alan.chen
 * @time 2019/1/8 7:44 PM
 */
@Configuration
public class RestConfiguration {

  @Autowired
  private RestTemplateBuilder restTemplateBuilder;

  //bean注解，就相当于在启动容器的的时候，将这个方法的返回的对象注册到spring中。
  @Bean
  public RestTemplate restTemplate(){
    return restTemplateBuilder.build();
  }

}
