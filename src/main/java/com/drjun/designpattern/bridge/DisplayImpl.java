package com.drjun.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 4.
 * Time: 오후 10:51
 * To change this template use File | Settings | File Templates.
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
