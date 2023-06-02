package com.solvd.laba.buildingcompany.manage;

public class Cost implements ICost {
    private int numberOfEmployees;
    private double materialsCost;
    private int dailyRate;

    public Cost(int numberOfEmployees, double materialsCost, int dailyRate) {
        this.numberOfEmployees = numberOfEmployees;
        this.materialsCost = materialsCost;
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getMaterialsCost() {
        return materialsCost;
    }

    public void setMaterialsCost(double materialsCost) {
        this.materialsCost = materialsCost;
    }
    @Override
    public String toString() {
        return "Cost{" +
                "numberOfEmployees=" + numberOfEmployees +
                ", materialsCost=" + materialsCost +
                ", dailyRate=" + dailyRate +
                '}';
    }
    @Override
    public double getTotalCost(){
        return ((dailyRate * numberOfEmployees)+ getMaterialsCost());
    }
    }


