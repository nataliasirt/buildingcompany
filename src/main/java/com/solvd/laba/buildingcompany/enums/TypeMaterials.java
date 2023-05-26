package com.solvd.laba.buildingcompany.enums;

public enum TypeMaterials {
    WOOD("Wood"),
    GLASS("Glass"),
    CONCRETE("Concrete");
    private String type;
    private TypeMaterials (String materilasName)
    {type = materilasName;}
    public String getType() {
        return type;
    }




}
