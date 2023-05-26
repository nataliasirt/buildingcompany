package com.solvd.laba.buildingcompany.manage;

import com.solvd.laba.buildingcompany.enums.TypeBuilding;

public class Task {
    private String name;
    private String description;
    private int duration;
    private TypeBuilding buildingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TypeBuilding getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(TypeBuilding buildingType) {
        this.buildingType = buildingType;
    }
}
