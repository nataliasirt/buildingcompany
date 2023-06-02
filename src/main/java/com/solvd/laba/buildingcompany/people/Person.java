package com.solvd.laba.buildingcompany.people;

import com.solvd.laba.buildingcompany.exceptions.InvalidDataException;

public abstract class Person {
    private String fullName;
    private int age;

    public Person(){
    }

    public Person(String fullName, int age){
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidDataException {
        if (fullName.length() > 0) {
            this.fullName = fullName;
        } else {
            throw new InvalidDataException("Full name cant be null");
        }
    }
    public int getAge(){return age;}

    public void setAge(int age) throws InvalidDataException {
        if (age > 0){
            this.age = age;
        } else {
            throw new InvalidDataException("Age cannot be null!");
        }
    }
}


