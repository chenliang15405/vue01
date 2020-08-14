package com.miniplay.data.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  未来天气
 * @auther alan.chen
 * @time 2019/1/8 4:28 PM
 */
@Data
public class Forecast implements Serializable {
  private static final long serialVersionUID = 2264392082448666384L;

  private String date;
  private String high;
  private String fengli;
  private String low;
  private String fengxiang;
  private String type;

}
