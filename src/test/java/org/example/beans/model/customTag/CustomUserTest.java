package org.example.beans.model.customTag;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomUserTest {

    @Test
    public void getBean(){
        ClassPathResource classPathResource = new ClassPathResource("application-context.xml");
        BeanFactory factory = new XmlBeanFactory(classPathResource);
        CustomUser customUser = (CustomUser) factory.getBean("customUser");
        System.out.println(customUser);
    }

}