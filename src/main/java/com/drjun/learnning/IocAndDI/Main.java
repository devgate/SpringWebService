package com.drjun.learnning.IocAndDI;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.StaticApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 8:53
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        StaticApplicationContext ac = new StaticApplicationContext();
        ac.registerBeanDefinition("printer", new RootBeanDefinition(StringPrinter.class));

        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        helloDef.getPropertyValues().addPropertyValue("printer", new RuntimeBeanReference("printer"));

        ac.registerBeanDefinition("hello", helloDef);

        Hello hello = ac.getBean("hello", Hello.class);
        hello.print();

        System.out.println(ac.getBean("printer").toString());
        System.out.println(ac.getBean("printer").toString());
    }
}
