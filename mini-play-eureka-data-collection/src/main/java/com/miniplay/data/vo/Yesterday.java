package com.miniplay.data.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 昨天天气数据
 * @auther alan.chen
 * @time 2019/1/8 4:28 PM
 */
@Data
public class Yesterday implements Serializable {
  private static final long serialVersionUID = -5784436968307439979L;

  private String date;
  private String high;
  private String fx;
  private String low;
  private String fl;
  private String type;
}
