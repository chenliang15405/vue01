package com.miniplay.miniplay.dao;

import com.miniplay.miniplay.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @auther alan.chen
 * @time 2019/1/9 12:33 PM
 */
@Repository
public interface ProvinceDao extends JpaRepository<Province,Integer>,JpaSpecificationExecutor<Province> {


}
