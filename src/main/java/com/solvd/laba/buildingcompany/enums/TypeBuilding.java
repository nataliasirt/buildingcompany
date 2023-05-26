package com.solvd.laba.buildingcompany.enums;

public enum TypeBuilding {
    ECONOMY ("Economy"),
    BUSINESS ("Business"),
    LUX ("Luxury");

    private String type;

    private TypeBuilding(String buildingName) {
        this.type = buildingName;
    }

    public String getType() {
        return type;
    }

    }



