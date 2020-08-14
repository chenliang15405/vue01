package com.miniplay.data.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miniplay.data.configuration.RedisCacheHelper;
import com.miniplay.data.service.WeatherDataService;
import com.miniplay.data.vo.WeatherDataResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @auther alan.chen
 * @time 2019/1/8 4:37 PM
 */
@Slf4j
@Service
@Transactional
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    private static final long TIME_OUT = 1800;
    @Autowired
    private RedisCacheHelper helper;
    @Resource
    private RestTemplate restTemplate;

    /**
     * 根据接口获取到服务中的weather data
     * @param cityId
     * @return
     */
    @Cacheable(value = "testRedisCache",key = "'weather:data:'+#cityId")
    @Override
    public WeatherDataResponse findWeatherByCityId(String cityId) {
      String uri = WEATHER_URI + "citykey=" + cityId;
      WeatherDataResponse weatherResponse = doGetWeather(uri);
      return weatherResponse;
    }

    @Cacheable(value = "testRedisCache",key = "'weather:data:'+#cityName")
    @Override
    public WeatherDataResponse findWeatherByCityName(String cityName) {
      String uri = WEATHER_URI + "city=" + cityName;
      WeatherDataResponse weatherResponse = doGetWeather(uri);
      return weatherResponse;
    }


    private WeatherDataResponse doGetWeather(String uri) {
      String strBody = null;
      WeatherDataResponse weatherResponse = null;
      //可以使用springboot中自带的jackson的对象，转换json使用
      ObjectMapper mapper = new ObjectMapper();
      try {
        //通过http请求获取到weather数据
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        log.info("weather接口返回数据：{}", response);
        if(response.getStatusCodeValue() == 200){
          strBody = response.getBody();
        }
        //将json转换为entity
        weatherResponse = mapper.readValue(strBody, WeatherDataResponse.class);
      } catch (IOException e) {
        log.error("获取weather date eroor : {}", e.getMessage());
      }
      return weatherResponse;
    }

}
