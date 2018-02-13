package com.company;

public class Dimensions {
    private int length;
    private int height;
    private int width;

    public Dimensions(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    private int getLength() {
        return length;
    }

    private int getHeight() {
        return height;
    }

    private int getWidth() {
        return width;
    }
}
