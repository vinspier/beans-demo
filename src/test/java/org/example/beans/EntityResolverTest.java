package org.example.beans;

import org.junit.Test;
import org.springframework.beans.factory.xml.DelegatingEntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * sax xml 本地验证文件读取配置测试
 *
 * @author: vinspier
 * @date: 2020/11/21 18:08
 */
public class EntityResolverTest {

    private static final Logger log = Logger.getLogger("EntityResolverTest");


    /**
     * spring 将 dtd和xsd的xml格式验证当存在本地，通过pubicId和systemId从本地获取
     * 有时候xml验证网络出问题,提供本地验证消除网络断开带来的不变
     *
     */
    @Test
    public void testDelegatingEntityResolver(){
        DelegatingEntityResolver resolver = new DelegatingEntityResolver(this.getClass().getClassLoader());
        try {
            InputSource inputSource = resolver.resolveEntity(null,"https://www.springframework.org/schema/beans/spring-beans-3.2.xsd");
            log.info("InputSource = [{" + inputSource.toString() + "}]");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
