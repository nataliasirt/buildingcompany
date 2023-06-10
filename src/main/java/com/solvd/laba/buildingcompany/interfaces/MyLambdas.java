package com.solvd.laba.buildingcompany.interfaces;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyLambdas {
    private static final Logger LOGGER = LogManager.getLogger(MyLambdas.class);
    public static void main(String[] args) {

        IFunction<Integer, Integer, Integer> function = (salary1, salary2) -> salary1 - salary2;
        LOGGER.info(function.apply(100, 50));

        IValue ref; ref = () -> 0.5;
        LOGGER.info("ENGINEER SALARY_COEFFICIENT: " + ref.getValue());




    }

    }

