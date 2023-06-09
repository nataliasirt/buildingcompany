package com.solvd.laba.buildingcompany.people;

public class Worker extends Employee implements IWorker{
    private final static double SALARY_COEFFICIENT = 0.1;
    private int dailyRate;
    private int numberOfEmployee;
    public Worker(){}

    public Worker(String fullName, int age, int salary, int dailyRate, int numberOfEmployee, int totalEmployeeCost){
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
    public double getWorkerCost() {
        return dailyRate * SALARY_COEFFICIENT * numberOfEmployee;
    }
}
