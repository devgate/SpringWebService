package com.drjun.modelmapper;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Date;

/**
 * Created by dr.jun on 2014. 1. 21..
 */
@Getter
@Setter
public class Company {
    private String name;
    private Location location;
    private Date createdAt;
}
