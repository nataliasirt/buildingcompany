package com.solvd.laba.buildingcompany.people;

public  class Engineer extends Employee implements IEngineer{
    private final static double SALARY_COEFFICIENT = 1.5;
    public int dailyRate;
    public int numberOfEmployee;

    public Engineer(String fullName, int age, int salary, int dailyRate, int numberOfEmployee, int totalEmployeeCost){
        super(fullName, age, salary, dailyRate, numberOfEmployee, totalEmployeeCost);
        this.dailyRate = dailyRate;
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

