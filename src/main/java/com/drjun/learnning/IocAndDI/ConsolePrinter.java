package com.drjun.learnning.IocAndDI;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 8:51
 * To change this template use File | Settings | File Templates.
 */
public class ConsolePrinter implements Printer{
    public void print(String message){
        System.out.println(message);
    }
}
