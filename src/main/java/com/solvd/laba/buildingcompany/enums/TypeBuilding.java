package com.solvd.laba.buildingcompany.enums;

public enum TypeBuilding {
    ECONOMY ("Economy"),
    BUSINESS ("Business"),
    LUX ("Luxury");

    private final String type;

    private TypeBuilding(String buildingName) {
        this.type = buildingName;
    }

    public String getType() {
        return type;
    }
    }



