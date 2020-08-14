package com.miniplay.data.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 天气数据状态
 * @auther alan.chen
 * @time 2019/1/8 4:26 PM
 */
@Data
public class WeatherDataResponse implements Serializable {
  private static final long serialVersionUID = -2415314627792422203L;

  private Weather data;
  private Integer status;
  private String desc;




}
