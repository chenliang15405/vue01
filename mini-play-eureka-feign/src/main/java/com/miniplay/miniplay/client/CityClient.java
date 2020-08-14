package com.miniplay.miniplay.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @auther alan.chen
 * @time 2019/1/11 9:58 AM
 */
@FeignClient("mini-play-eureka-client-zuul")
public interface CityClient {

  @RequestMapping(value = "/city/cities",method = RequestMethod.GET)
  String listCity()throws Exception;
}
