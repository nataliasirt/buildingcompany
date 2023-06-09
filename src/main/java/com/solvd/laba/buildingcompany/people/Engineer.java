package com.solvd.laba.buildingcompany.people;

public  class Engineer extends Employee implements IEngineer {
    private final static double SALARY_COEFFICIENT = 0.5;
    public int dailyRate;
    public int numberOfEmployee;

    public Engineer(){

    }
    public Engineer(int salary, int dailyRate, int numberOfEmployee) {
        super(salary, dailyRate, numberOfEmployee);
        this.dailyRate = dailyRate;
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public int getDailyRate() {
        return dailyRate;
    }

    @Override
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    @Override
    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "dailyRate=" + dailyRate +
                ", numberOfEmployee=" + numberOfEmployee +
                '}';
    }

    @Override
    public double getEngineerCost() {
        return numberOfEmployee * dailyRate * SALARY_COEFFICIENT;
    }
}

