package com.drjun.learnning.IocAndDI;

import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 13.
 * Time: 오후 1:59
 * To change this template use File | Settings | File Templates.
 */
public class HelloConfig {
    @Bean
    public Hello hello(){
        Hello hello = new Hello();
        hello.setName("Spring");
        hello.setPrinter(printer());
        return hello;
    }

    @Bean
    public Hello hello2(){
        Hello hello = new Hello();
        hello.setName("Spring2");
        hello.setPrinter(printer());
        return hello;
    }

    @Bean
    private Printer printer() {
        return new StringPrinter();
    }
}
