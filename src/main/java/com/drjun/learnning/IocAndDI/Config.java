package com.drjun.learnning.IocAndDI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 13.
 * Time: 오후 2:30
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class Config {
    @Value("#{systemProperties['os.name']}")
    String osName;

    public String getOsName(){
        return this.osName;
    }
}
