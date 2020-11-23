package org.example.beans.customTag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 自定义的标签命名空间处理器
 *
 * @author: vinspier
 * @date: 2020/11/23 22:02
 */
public class CustomNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("customUser",new CustomUserBeanDefinitionParser());
    }
}
