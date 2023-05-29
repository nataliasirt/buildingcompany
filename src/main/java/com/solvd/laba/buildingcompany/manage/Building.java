package com.solvd.laba.buildingcompany.manage;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.people.Engineer;
import com.solvd.laba.buildingcompany.people.Worker;
import java.util.List;

public class Building {
    private TypeBuilding typeBuilding;
    private int floorArea;
    private int floorCount;
    private int totalArea;
    private List<Engineer> engineers;
    private List<Worker> workers;

    public Building() {
    }

    public Building(TypeBuilding typeBuilding, int floorArea, int floorCount, int totalArea) {
        this.floorArea = floorArea;
        this.floorCount = floorCount;
        this.totalArea = totalArea;
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
        return getFloorArea() * getFloorCount();
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    public List<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Engineer> engineers) {
        this.engineers = engineers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}




