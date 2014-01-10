package com.drjun.orm;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2013. 12. 26.
 * Time: 오후 3:31
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
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
}
