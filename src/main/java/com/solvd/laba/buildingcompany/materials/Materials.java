package com.solvd.laba.buildingcompany.materials;
import com.solvd.laba.buildingcompany.enums.TypeBuilding;
import com.solvd.laba.buildingcompany.enums.TypeMaterials;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Materials implements IMaterials{
    private static final Logger LOGGER = LogManager.getLogger(Materials.class);
    private TypeMaterials typeMaterials;
    private String name;
    private int quantity;
    private int pricePerEach;
    private int totalCostMaterials;
    public Materials(){
    }
    public Materials(TypeMaterials typeMaterials, String name, int quantity, int pricePerEach, int totalCostMaterials){
    this.name = name;
    this.quantity = quantity;
    this.pricePerEach = pricePerEach;
    this.totalCostMaterials = totalCostMaterials;

    }

    public TypeMaterials getTypeMaterials() {
        return typeMaterials;
    }

    public void setTypeMaterials(TypeMaterials typeMaterials) {
        this.typeMaterials = typeMaterials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerEach() {
        return pricePerEach;
    }

    public void setPricePerEach(int pricePerEach) {
        this.pricePerEach = pricePerEach;
    }

    public int getTotalCostMaterials() {
        return getQuantity() * getPricePerEach();
    }

    public void setTotalCostMaterials(int totalCostMaterials) {
        this.totalCostMaterials = totalCostMaterials;
    }

    @Override
    public String toString() {
        LOGGER.info("Materials = " +
                "name = "  + name +
                "quantity = " + quantity+
                "pricePerEach = " + pricePerEach);
        return "Materials{" +
                "name = " + name + '\'' +
                ", quantity =" + quantity +
                ", pricePerEach = " + pricePerEach +
                '}';
    }
    @Override
    public int getMaterialsCost() {
        return this.quantity * this.pricePerEach;
    }
}
