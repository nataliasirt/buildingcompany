package com.solvd.laba.buildingcompany.people;

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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}


