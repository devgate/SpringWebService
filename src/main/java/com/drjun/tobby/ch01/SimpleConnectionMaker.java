package com.drjun.tobby.ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2014. 1. 10.
 * Time: 오후 5:18
 * To change this template use File | Settings | File Templates.
 */
public class SimpleConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
        return c;
    }

    public Connection makeNewConnection() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
