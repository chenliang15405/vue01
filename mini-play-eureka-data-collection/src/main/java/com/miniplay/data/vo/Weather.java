package com.miniplay.data.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 天气数据实体类
 * @auther alan.chen
 * @time 2019/1/8 4:27 PM
 */
@Data
public class Weather implements Serializable {
  private static final long serialVersionUID = -5715600568526140474L;

  private String city;

  private String aqi;

  private String ganmao;

  private String wendu;

  private Yesterday yesterday;

  private List<Forecast> forecast;
}
