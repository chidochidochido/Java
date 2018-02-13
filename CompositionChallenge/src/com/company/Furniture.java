package com.company;

public class Furniture {
    private Dimensions furnitureDimensions;
    private String furnitureType;
    private String color;
    private String material;

    public Furniture(Dimensions furnitureDimensions, String furnitureType, String color, String material) {
        this.furnitureDimensions = furnitureDimensions;
        this.furnitureType = furnitureType;
        this.color = color;
        this.material = material;
    }

    public Dimensions getFurnitureDimensions() {
        return furnitureDimensions;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
