package com.solvd.laba.buildingcompany.interfaces;
import java.util.logging.Logger;

public class MyLambdas {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MyLambdas.class));

    public static void main(String[] args) {
        IFunction<Integer, Integer, Integer> function = (salary1, salary2) -> salary1 - salary2;
        LOGGER.info(String.valueOf(function.apply(750, 500)));
    }
    }

