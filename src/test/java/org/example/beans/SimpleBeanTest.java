package org.example.beans;

import org.example.beans.model.SimpleBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;


public class SimpleBeanTest {

    private static final Logger log = Logger.getLogger("SimpleBeanTest");

    @Test
    public void testClassPathResource(){
        ClassPathResource classPathResource = new ClassPathResource("application-beans-pre.xml");
        log.info(classPathResource.getPath());
        try {
            InputStream inputStream = classPathResource.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFileSystemResource(){
        FileSystemResource fileSystemResource = new FileSystemResource("application-beans-pre.xml");
        log.info(fileSystemResource.getPath());
        try {
            InputStream inputStream = fileSystemResource.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getBean(){
        ClassPathResource classPathResource = new ClassPathResource("application-context.xml");
        BeanFactory factory = new XmlBeanFactory(classPathResource);
        SimpleBean simpleBean = (SimpleBean) factory.getBean("simpleBean");
        System.out.println(simpleBean);
        SimpleBean simpleBean1 = (SimpleBean) factory.getBean("simpleBean1");
        /** 判断默认单例模式 */
        System.out.println(simpleBean == simpleBean1);
    }

}