package com.drjun.learnning.IocAndDI;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 8:38
 * To change this template use File | Settings | File Templates.
 */
public class Hello {
    private String name;
    private Printer printer;

    public String sayHello(){
        return "Hello " + name;
    }

    public void print() {
        this.printer.print(sayHello());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
