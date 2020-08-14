package com.miniplay.miniplay.controller;

import com.miniplay.miniplay.service.CityService;
import com.miniplay.miniplay.vo.CityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/2 7:09 PM
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 城市列表
     * @return
     */
    @RequestMapping(value = "/cities",method = RequestMethod.GET)
    public List<CityVo> listCity(){
        List<CityVo> cityList = cityService.getCtiyList();
        return cityList;
    }


}
