package com.miniplay.miniplay.entity;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;

/**
 * @auther alan.chen
 * @time 2019/1/9 4:10 PM
 */
@Data
@Entity
@Table(name = "MINI_CITY")
public class City implements Serializable {
  private static final long serialVersionUID = 6860512545538136044L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Integer id;
  @Column(name = "CITY_NAME")
  private String cityName;
  @Column(name = "CITY_CODE")
  private String cityCode;
  @ManyToOne(targetEntity = Province.class)
  @JoinColumn(name = "province_id")
  private Province province;


}
