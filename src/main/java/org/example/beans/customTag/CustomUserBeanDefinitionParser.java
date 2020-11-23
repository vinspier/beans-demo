package org.example.beans.customTag;

import org.example.beans.model.customTag.CustomUser;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CustomUserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    private static final String ID = "id";

    private static final String NAME = "name";

    private static final String EMAIL = "email";



    @Override
    protected Class<?> getBeanClass(Element element) {
        return CustomUser.class;
    }

    /**
     * 自定义解析
     * 将解析后的元素 存入到BeanDefinitionBuilder中去
     * */
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute(ID);
        String name = element.getAttribute(NAME);
        String email = element.getAttribute(EMAIL);
        if (StringUtils.hasText(id)){
            builder.addPropertyValue(ID,id);
        }
        if (StringUtils.hasText(name)){
            builder.addPropertyValue(NAME,name);
        }
        if (StringUtils.hasText(email)){
            builder.addPropertyValue(EMAIL,email);
        }
        super.doParse(element, builder);
    }
}
