package com.drjun.modelmapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class LocationModel {
    private String address;
    private Date createdAt;
}