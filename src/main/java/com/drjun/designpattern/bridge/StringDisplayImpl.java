package com.drjun.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 4.
 * Time: 오후 10:55
 * To change this template use File | Settings | File Templates.
 */
public class StringDisplayImpl extends DisplayImpl {

    private String string;
    private int width;
    public StringDisplayImpl(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen(){
        printLine();
    }

    public void rawPrint(){
        System.out.println("|"+ string + "|");
    }

    public void rawClose(){
        printLine();
    }

    public void printLine(){
        System.out.print("+");

        for(int i =0; i < width; i++){
            System.out.print("-");
        }

        System.out.println("+");
    }
}
