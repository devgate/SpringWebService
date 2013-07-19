package com.drjun.learnning.IocAndDI;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 13.
 * Time: 오후 2:04
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//@Configuration
public class ServiceConfig{
    @Bean
    public DataSource dataSource(){
        //SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        //dataSource.setDriverClass("org.hsqldb.jdbc.JDBCDriver");

        //return dataSource;

        return null;

    }
}
