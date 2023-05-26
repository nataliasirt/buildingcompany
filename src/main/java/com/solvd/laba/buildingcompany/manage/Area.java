package com.solvd.laba.buildingcompany.manage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Area implements IArea{
    private static final Logger logger = LogManager.getLogger(Area.class);
    private int width;
    private int length;
    private int price;
    public Area(int width, int length, int price){
        this.width = width;
        this.length = length;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Area" + width+ "width" + length + "length" + price + "price");
        return "Area{" +
                "width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}

