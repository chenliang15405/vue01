package com.miniplay.miniplay.entity;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/9 12:05 PM
 */
@Data
@Entity
@Table(name = "MINI_PROVINCE")
public class Province implements Serializable {
  private static final long serialVersionUID = 2957732415933388593L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Integer id;
  @Column(name = "NAME")
  private String name;
  @Column(name = "PROVINCE_CODE")
  private String provinceCode;
  @OneToMany(targetEntity = City.class,mappedBy = "id")//一对多
  @Cascade(CascadeType.ALL)//及联
  private List<City> cityList = new ArrayList<>();


}
