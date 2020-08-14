package com.miniplay.miniplay.service.impl;

import com.miniplay.miniplay.service.CityService;
import com.miniplay.miniplay.vo.CityVo;
import com.miniplay.miniplay.vo.CityList;
import com.miniplay.data.XmlBuilder;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/3 6:37 PM
 */
@Service
@Transactional
@Slf4j
public class CityServiceImpl implements CityService {


    /**
     * 获取城市列表
     * 从xml文件中获取，并缓存到redis中
     * @return
     */
    //将返回的数据存储到value中配置的缓存名称中，并且文件夹的目录是city/all，将数据存储在里面
    //如果是findById 就可以在city:all:+#id 就表示将参数id作为文件夹的目录，里面放入的是返回的数据
//    @Cacheable(value="testRedisCache",key="'city:all'")
    @Cacheable(cacheNames="testRedisCache",key="'city:all'")
    @Override
    public List<CityVo> getCtiyList() {
        //读取xml获取城市列表，并缓存到redis中
        Resource classPathResource = new ClassPathResource("citylist.xml");
        try {
            @Cleanup BufferedReader bufferedReader = null;
            @Cleanup InputStreamReader in = null;
            in = new InputStreamReader(classPathResource.getInputStream(), "UTF-8");
            bufferedReader = new BufferedReader(in);
            StringBuffer str = new StringBuffer();
            String line = "";

            while ((line = bufferedReader.readLine()) != null){
                str.append(line);
            }

            //xml转换java对象
            CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, str.toString());
            List<CityVo> list = cityList.getCityList();
            return list;
        } catch (IOException e) {
            log.error("获取城市列表失败:{}",e.getMessage());
        } catch (Exception e) {
            log.error("xml解析city异常：{}",e.getMessage());
        }
        return null;
    }
}
