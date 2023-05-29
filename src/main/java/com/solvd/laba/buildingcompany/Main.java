package com.solvd.laba.buildingcompany;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.manage.Building;
import com.solvd.laba.buildingcompany.materials.Materials;
import com.solvd.laba.buildingcompany.people.Customer;
import com.solvd.laba.buildingcompany.people.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Building economyBuilding = new Building();
        economyBuilding.setFloorArea(100);
        economyBuilding.setFloorCount(25);
        economyBuilding.setTypeBuilding(TypeBuilding.ECONOMY);
        economyBuilding.setTotalArea(economyBuilding.getFloorArea() * economyBuilding.getFloorCount());
        LOGGER.info("Calculate Total Area for your Project in sq meters " + economyBuilding.getTotalArea());

        Materials woodMaterials = new Materials();
        woodMaterials.setQuantity(25);
        woodMaterials.setPricePerEach(50);
        woodMaterials.setTotalCostMaterials(woodMaterials.getQuantity() * woodMaterials.getPricePerEach());
        LOGGER.info("Calculate Total Cost of Concrete for this project in USD " + woodMaterials.getMaterialsCost());
        Materials cementMaterials = new Materials();
        cementMaterials.setQuantity(50);
        cementMaterials.setPricePerEach(50);
        cementMaterials.setTotalCostMaterials(cementMaterials.getQuantity() * cementMaterials.getPricePerEach());
        LOGGER.info("Calculate Total Cost of Wood for this project in USD " + cementMaterials.getMaterialsCost());

        Employee employee = new Employee();
        employee.setNumberOfEmployee(10);
        employee.setDailyRate(20);
        LOGGER.info("Calculate Total Cost of Employees for this project in USD " + employee.getEmployeeCost());
        LOGGER.info("Calculate Total Cost of Employees & Materials for this project in USD " + (employee.getEmployeeCost() +
                woodMaterials.getTotalCostMaterials() +
                cementMaterials.getTotalCostMaterials() +
                economyBuilding.getTotalArea()));

        //Log ins
        Customer customer = new Customer("Joe Doe", 35);
        Employee employee1 = new Employee("Ivan Petrov", 45, 50000, 20, 5, 100);
        customer.login();
        employee.login();
    }
}




