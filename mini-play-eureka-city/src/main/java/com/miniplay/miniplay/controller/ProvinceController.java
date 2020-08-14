package com.miniplay.miniplay.controller;

import com.miniplay.miniplay.service.ProvinceService;
import com.miniplay.miniplay.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/9 12:03 PM
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {

  @Autowired
  private ProvinceService provinceService;

  /**
   * province list
   * @return
   */
  @RequestMapping("/list")
  public List<Province> findList(){
    List<Province> provinceList = provinceService.findProvinceList();
    return provinceList;
  }

  @RequestMapping("/{id}")
  public Province findProvinceById(@PathVariable Integer id){
    Province province = provinceService.findProvinceById(id);
    return province;
  }





}
