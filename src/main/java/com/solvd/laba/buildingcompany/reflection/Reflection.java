package com.solvd.laba.buildingcompany.reflection;
import com.solvd.laba.buildingcompany.people.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    private static final Logger LOGGER = LogManager.getLogger(Reflection.class);
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Customer customer1 = new Customer("John", 45);
        Field[] customerFields = customer1.getClass().getDeclaredFields();
        for (Field field : customerFields) {
            if (field.getName().equals("fullName")) {
                field.setAccessible(true);
                field.set(customer1, "Jimmy McGill");
                LOGGER.info("Access field fullName: " + field.getName());
            }
        }
        LOGGER.info("Access field fullName & set new name  for Customer: " + customer1.getFullName());
        Method[] customerMethod = customer1.getClass().getDeclaredMethods();
        for (Method method : customerMethod) {
            if(method.getName().equals("heyPrivateMethod")){
                method.setAccessible(true);
                method.invoke(customer1);
            }
            LOGGER.info("Access private method via reflection for Customer: " + method.getName());
        }
    }
}

