package com.solvd.laba.buildingcompany.manage;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.people.Engineer;
import com.solvd.laba.buildingcompany.people.Worker;
import java.util.List;

public class Building implements IBuilding {
    private TypeBuilding typeBuilding;
    private int floorArea;
    private int floorCount;
    private int totalArea;

    public Building() {
    }
    public Building(TypeBuilding typeBuilding, int floorArea, int floorCount, int totalArea) {
        this.floorArea = floorArea;
        this.floorCount = floorCount;
        this.totalArea = floorArea * floorCount;
    }
    public TypeBuilding getTypeBuilding() {
        return typeBuilding;
    }

    public void setTypeBuilding(TypeBuilding typeBuilding) {

        this.typeBuilding = typeBuilding;
    }
    public int getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getTotalArea() {
        return floorArea * floorCount;
    }
    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

}




