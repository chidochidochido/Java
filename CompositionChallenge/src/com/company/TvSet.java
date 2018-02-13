package com.company;

public class TvSet extends Furniture {
    private boolean tvState;

    public TvSet(Dimensions furnitureDimensions, String color, String material, boolean myTvState) {
        super(furnitureDimensions, "TV Set", color, material);
        this.tvState = myTvState;
    }

    public void turnTVSetOn() {
        tvState = true;
        System.out.println("Turning TV Set ON");
    }

    public void turnTVSetOff() {
        tvState = false;
        System.out.println("Turning TV Set OFF");
    }
}
