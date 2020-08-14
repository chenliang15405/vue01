package com.miniplay.data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * @auther alan.chen
 * @time 2019/1/3 8:31 PM
 */
public class XmlBuilder {

    public static Object xmlStrToObject(Class<?> clazz,String xmlStr)throws Exception{
        Object xmlObject = null;
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Reader reader = null;

        //xml转换为对象的接口
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);

        if(xmlObject != null){
            reader.close();
        }
        return xmlObject;
    }
}
