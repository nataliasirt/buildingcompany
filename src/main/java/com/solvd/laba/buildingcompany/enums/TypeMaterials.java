package com.solvd.laba.buildingcompany.enums;

public enum TypeMaterials {
    WOOD("Wood"),
    CEMENT("Cement"),
    GLASS("Glass");

    private final String type;
    private TypeMaterials (String materialsName)
    {this.type = materialsName;}
    public String getType() {
        return type;
    }



}
