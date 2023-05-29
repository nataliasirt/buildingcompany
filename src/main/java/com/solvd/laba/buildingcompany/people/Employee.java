package com.solvd.laba.buildingcompany.people;
import com.solvd.laba.buildingcompany.exceptions.InvalidNumberException;
import com.solvd.laba.buildingcompany.manage.ICost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee extends Person implements IEmployee {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    private int salary;
    private int dailyRate;
    private int numberOfEmployee;
    public Employee(){

    }
    public Employee(String fullName, int age, int salary, int dailyRate, int numberOfEmployee, int totalEmployeeCost) {
        super(fullName, age);
        this.salary = salary;
        this.dailyRate = dailyRate;
        this.numberOfEmployee = numberOfEmployee;

    }
    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public int getTotalEmployeeCost() {
        return numberOfEmployee * dailyRate;
    }


    public void setSalary(int salary) throws InvalidNumberException {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new InvalidNumberException("Salary cannot be null!");
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dailyRate=" + dailyRate +
                ", numberOfEmployee=" + numberOfEmployee +
                '}';
    }

    @Override
    public double getEmployeeCost() {
        return (dailyRate * numberOfEmployee);

    }
    public final void login() {LOGGER.info("Employee logged into account");
        }
    }


