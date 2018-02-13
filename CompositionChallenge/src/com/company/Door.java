package com.company;

public class Door {
    private Dimensions doorDimensions;
    private String color;
    private String texture;
    private boolean isOpen;

    public Door(Dimensions doorDimensions, String color, String texture, boolean isOpen) {
        this.doorDimensions = doorDimensions;
        this.color = color;
        this.texture = texture;
        this.isOpen = isOpen;
    }

    public void openDoor() {
        this.isOpen = true;
        System.out.println("Opening Door");
    }

    public void closeDoor() {
        this.isOpen = false;
        System.out.println("Closing Door");
    }


    private Dimensions getDoorDimensions() {
        return doorDimensions;
    }

    private String getColor() {
        return color;
    }

    private String getTexture() {
        return texture;
    }

    private boolean isOpen() {
        return isOpen;
    }
}
