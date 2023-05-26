package com.solvd.laba.buildingcompany;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.manage.Building;
import com.solvd.laba.buildingcompany.manage.Cost;
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

        Materials materials = new Materials();
        materials.setName("Concrete");
        materials.setQuantity(25);
        materials.setPricePerEach(50);
        materials.setTotalCostMaterials(materials.getQuantity() * materials.getPricePerEach());
        LOGGER.info("Calculate Total Cost of Concrete for this project in USD " + materials.getMaterialsCost());
        materials.setName("Wood");
        materials.setQuantity(50);
        materials.setPricePerEach(50);
        materials.setTotalCostMaterials(materials.getQuantity() * materials.getPricePerEach());
        LOGGER.info("Calculate Total Cost of Wood for this project in USD " + materials.getMaterialsCost());

        Employee employee = new Employee();
        employee.setNumberOfEmployee(10);
        employee.setDailyRate(20);
        employee.setTotalEmployeeCost(employee.getNumberOfEmployee() * employee.getDailyRate());
        LOGGER.info("Calculate Total Cost of Employees for this project in USD " + employee.getEmployeeCost());
        LOGGER.info("Calculate Total Cost of Employees & Materials for this project in USD " + (employee.getEmployeeCost() +
                materials.getTotalCostMaterials() + economyBuilding.getTotalArea()));

        //Log ins
        Customer customer = new Customer("Joe", 35);
        customer.login();
        employee.login();
    }
}




