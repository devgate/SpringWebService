package com.drjun.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 4.
 * Time: 오후 10:49
 * To change this template use File | Settings | File Templates.
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
