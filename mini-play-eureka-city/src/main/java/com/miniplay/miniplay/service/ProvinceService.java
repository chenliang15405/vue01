package com.miniplay.miniplay.service;

import com.miniplay.miniplay.entity.Province;

import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/9 12:31 PM
 */
public interface ProvinceService {
  List<Province> findProvinceList();

  Province findProvinceById(Integer id);

}
