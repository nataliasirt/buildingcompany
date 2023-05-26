package com.solvd.laba.buildingcompany.exceptions;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(){
    }
    public InvalidNumberException(String message) {
        super(message);
    }
}
