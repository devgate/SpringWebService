package com.drjun.modelmapper;

import org.modelmapper.PropertyMap;

public class CompanyModelMap extends PropertyMap<CompanyModel, Company> {
    @Override
    protected void configure() {
        //Explicit mappings for createdAt/updatedAt
        //map().setCreatedAt(source.getCreatedAt());

    }
}