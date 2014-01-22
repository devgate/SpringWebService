package com.drjun.modelmapper;

import org.modelmapper.PropertyMap;

public class LocationModelMap extends PropertyMap<LocationModel, Location> {
    @Override
    protected void configure() {
        //Explicit mappings for createdAt/updatedAt
        //map().setCreatedAt(source.getCreatedAt());
    }
}