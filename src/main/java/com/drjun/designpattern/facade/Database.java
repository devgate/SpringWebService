package com.drjun.designpattern.facade;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 18.
 * Time: 오후 6:31
 * To change this template use File | Settings | File Templates.
 */
public class Database {

    Observer obj = new Observer() {
        @Override
        public void update(Observable o, Object arg) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
    private Database(){}


}
