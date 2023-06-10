package com.solvd.laba.buildingcompany.people;
import com.solvd.laba.buildingcompany.exceptions.InvalidAgeException;
import com.solvd.laba.buildingcompany.exceptions.NameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Person {
    private final static Logger LOGGER = LogManager.getLogger(Customer.class);
    private String fullName;
    private int age;

    public Customer() {
    }
    public Customer(String fullName, int age) {
        super(fullName, age);
        this.fullName = fullName;
        this.age = age;

        if (fullName.length() > 0 && fullName.length() <= 30) {
            this.fullName = fullName;
        } else {
            throw new NameException("Name is incorrect length.");
        }
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Invalid age! The age should be between 18 and 100.");
        }
    }

    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    private void heyPrivateMethod(){
        LOGGER.info("Printing with private method via Reflection ");
    }
}
