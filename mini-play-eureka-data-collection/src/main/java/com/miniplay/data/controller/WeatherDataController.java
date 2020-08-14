package com.miniplay.data.controller;

import com.miniplay.data.service.WeatherDataService;
import com.miniplay.data.vo.WeatherDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther alan.chen
 * @time 2019/1/8 4:24 PM
 */
@RestController
@RequestMapping("/weather")
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    /**
     * 根据cityId查询weather data
     * @param cityId
     * @return
     */
    @RequestMapping("/city/{cityId}")
    public WeatherDataResponse getWeatherByCityId(@PathVariable String cityId){
        WeatherDataResponse dataByCityId = weatherDataService.findWeatherByCityId(cityId);
        return dataByCityId;
    }

    /**
     * 根据cityName查询weather data
     * @return
     */
    @RequestMapping("/city/{cityName}")
    public WeatherDataResponse getWeatherByCityName(@PathVariable String cityName){
        WeatherDataResponse dataByCityName = weatherDataService.findWeatherByCityName(cityName);
        return dataByCityName;
    }

}
