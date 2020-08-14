package com.miniplay.data.service;

import com.miniplay.data.vo.WeatherDataResponse;

/**
 * @auther alan.chen
 * @time 2019/1/8 4:37 PM
 */
public interface WeatherDataService {

    WeatherDataResponse findWeatherByCityId(String cityId);

    WeatherDataResponse findWeatherByCityName(String cityName);
}
