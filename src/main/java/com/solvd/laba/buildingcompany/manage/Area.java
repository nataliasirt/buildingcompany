package com.solvd.laba.buildingcompany.manage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Area implements IArea{
    private static final Logger logger = LogManager.getLogger(Area.class);
    private int width;
    private int length;
    private int floorArea;
    public Area(int width, int length, int price){
        this.width = width;
        this.length = length;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width){
        if (width > 0) {
            this.width = width;
        } else{
            throw new IllegalArgumentException("Width cannot be null!");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Area" + width+ "width" + length + "length" + floorArea + "Floor Area");
        return "Area{" +
                "width=" + width +
                ", length=" + length +
                ", price=" + floorArea +
                '}';
    }
    @Override
    public double getFloorArea() {
        return width * length;
    }
}


