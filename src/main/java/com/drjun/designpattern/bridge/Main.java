package com.drjun.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 4.
 * Time: 오후 10:52
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
