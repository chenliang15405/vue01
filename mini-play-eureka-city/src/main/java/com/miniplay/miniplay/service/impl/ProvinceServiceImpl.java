package com.miniplay.miniplay.service.impl;

import com.miniplay.miniplay.dao.ProvinceDao;
import com.miniplay.miniplay.service.ProvinceService;
import com.miniplay.miniplay.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @auther alan.chen
 * @time 2019/1/9 12:31 PM
 */
@Transactional
@Service
public class ProvinceServiceImpl implements ProvinceService {

  @Autowired
  private ProvinceDao provinceDao;


  @Override
  public List<Province> findProvinceList() {
    List<Province> list = provinceDao.findAll();
    return list;
  }

  @Override
  public Province findProvinceById(Integer id) {
    return provinceDao.findById(id).get();
  }


}
