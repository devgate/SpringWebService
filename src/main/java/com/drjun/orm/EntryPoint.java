package com.drjun.orm;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 9. 23.
 * Time: 오후 3:05
 * To change this template use File | Settings | File Templates.
 */
public class EntryPoint {

    private final String identity;

    public EntryPoint (String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }

    public EntryPoint persist() {
        Registrar.add(this.getClass(), this);
        return this;
    }

}
