package com.company;

public class Wall {
    private Dimensions wallDimensions;
    private String color;
    private String texture;

    public Wall(Dimensions wallDimensions, String color, String texture) {
        this.wallDimensions = wallDimensions;
        this.color = color;
        this.texture = texture;
    }

    private Dimensions getWallDimensions() {
        return wallDimensions;
    }

    private String getColor() {
        return color;
    }

    private String getTexture() {
        return texture;
    }
}
