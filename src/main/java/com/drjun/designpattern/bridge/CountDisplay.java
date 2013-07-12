package com.drjun.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 4.
 * Time: 오후 10:48
 * To change this template use File | Settings | File Templates.
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl impl){
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for(int i = 0; i < times; i++){
            print();
        }
        close();
    }
}
