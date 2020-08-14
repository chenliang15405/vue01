package com.miniplay.miniplay.vo;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @auther alan.chen
 * @time 2019/1/3 8:33 PM
 */
@Getter
@Setter
@XmlRootElement(name="China")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {

    @XmlElement(name="county")
    private List<CityVo> cityList;

}
