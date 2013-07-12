package com.drjun.learnning.IocAndDI;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 8:44
 * To change this template use File | Settings | File Templates.
 */
public class StringPrinter implements Printer{
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void print(String message) {
        this.buffer.append(message);
    }

    public String toString(){
        return this.buffer.toString();
    }
}
