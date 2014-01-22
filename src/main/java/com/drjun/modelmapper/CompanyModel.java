package com.drjun.modelmapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by dr.jun on 2014. 1. 21..
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class CompanyModel {
    private String name;
    private LocationModel location;
    private Date createdAt;
}
