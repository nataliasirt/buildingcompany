package com.solvd.laba.buildingcompany.interfaces;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import static com.solvd.laba.buildingcompany.interfaces.StreamAPI.getMaterials;

public class MyLambdas {
    private static final Logger LOGGER = LogManager.getLogger(MyLambdas.class);
    public static void main(String[] args) {

        IFunction<Integer, Integer, Integer> function = (salary1, salary2) -> salary1 - salary2;
        LOGGER.info(function.apply(100, 50));

        IValue ref; ref = () -> 0.5;
        LOGGER.info("ENGINEER SALARY_COEFFICIENT: " + ref.getValue());

        //using lambda in streaming API
        List<String> myMaterials = getMaterials();
        LOGGER.info("Other Materials:");
        myMaterials.stream()
                .filter((p) -> p.startsWith("insulation"))
                .forEach((p) ->LOGGER.info(p));









    }

    }

