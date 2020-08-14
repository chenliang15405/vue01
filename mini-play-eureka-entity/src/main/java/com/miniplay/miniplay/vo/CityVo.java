package com.miniplay.miniplay.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @auther alan.chen
 * @time 2019/1/2 8:27 PM
 */
@Getter
@Setter
@XmlRootElement(name="county")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityVo implements Serializable {
    private static final long serialVersionUID = 4071057737832681721L;

    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "name")
    private String cityName;
    @XmlAttribute(name = "weatherCode")
    private String cityCode;
    @XmlAttribute(name = "province")
    private String province;


}
