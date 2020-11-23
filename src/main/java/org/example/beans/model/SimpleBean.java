package org.example.beans.model;

import java.io.Serializable;

/**
 * spring bean 初始demo 探究spring IoC容器
 *
 * @author vinspier
 */
public class SimpleBean implements Serializable {

    private String name;

    private int age;

    public SimpleBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init(){
        System.out.println("init model SimpleBean");
    }

    public void destroy(){
        System.out.println("destroy model SimpleBean");
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
