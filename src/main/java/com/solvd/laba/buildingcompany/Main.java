package com.solvd.laba.buildingcompany;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.enums.TypeMaterials;
import com.solvd.laba.buildingcompany.manage.Building;
import com.solvd.laba.buildingcompany.materials.Materials;
import com.solvd.laba.buildingcompany.people.Employee;
import com.solvd.laba.buildingcompany.people.Engineer;
import com.solvd.laba.buildingcompany.people.Worker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Building economyBuilding = new Building();
        economyBuilding.setFloorCount(3);
        economyBuilding.setFloorArea(1000);
        economyBuilding.setTypeBuilding(TypeBuilding.ECONOMY);
        LOGGER.info("Calculate Total Area for Economy Building in sq meters " + economyBuilding.getTotalArea());

        Materials woodMaterials = new Materials();
        woodMaterials.setQuantity(25);
        woodMaterials.setPricePerEach(50);
        woodMaterials.setTypeMaterials(TypeMaterials.WOOD);
        LOGGER.info("Calculate Total Cost of Wood in USD " + woodMaterials.getTotalCostMaterials());

        Materials cementMaterials = new Materials();
        cementMaterials.setQuantity(50);
        cementMaterials.setPricePerEach(50);
        cementMaterials.setTypeMaterials(TypeMaterials.CEMENT);
        LOGGER.info("Calculate Total Cost of Cement in USD " + cementMaterials.getTotalCostMaterials());
        LOGGER.info("Calculate Total Cost of Wood & Cement in USD " + ((cementMaterials.getTotalCostMaterials()) +(woodMaterials.getTotalCostMaterials())));

        Employee employee = new Employee();
        employee.setNumberOfEmployee(10);
        employee.setDailyRate(20);
        LOGGER.info("Calculate Total Cost of Employees in USD " + employee.getEmployeeCost());

        Engineer engineer = new Engineer();
        engineer.setNumberOfEmployee(5);
        engineer.setDailyRate(25);
        LOGGER.info("Calculate Total Cost of Engineer in USD " + engineer.getEngineerCost());

        Worker worker = new Worker();
        worker.setNumberOfEmployee(20);
        worker.setDailyRate(18);
        LOGGER.info("Calculate Total Cost of Workers in USD " + worker.getWorkerCost());
        LOGGER.info("Calculate Total Cost of Employees in USD " + (employee.getEmployeeCost() + worker.getWorkerCost() +
                engineer.getEngineerCost()));
        LOGGER.info("Calculate Total Cost of Employees & all Materials for this project in USD " +
                (employee.getEmployeeCost() +
                worker.getWorkerCost() +
                engineer.getEngineerCost() +
                woodMaterials.getTotalCostMaterials() +
                cementMaterials.getTotalCostMaterials() +
                economyBuilding.getTotalArea()));
    }
}




