package com.drjun.tobby.ch01;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2014. 1. 10.
 * Time: 오후 5:14
 * To change this template use File | Settings | File Templates.
 */
public class UserDao {
    private SimpleConnectionMaker simpleConnectionMaker;

    public UserDao(){
        simpleConnectionMaker = new SimpleConnectionMaker();
    }

    public UserDao(SimpleConnectionMaker connectionMaker){
        this.simpleConnectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException, SQLException{
        Connection c = simpleConnectionMaker.makeNewConnection();
    }

    public User get(String id) throws ClassNotFoundException, SQLException{
        Connection c = simpleConnectionMaker.makeNewConnection();
        return null;
    }

}
