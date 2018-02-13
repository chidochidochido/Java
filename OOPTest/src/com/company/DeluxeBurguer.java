package com.company;

public class DeluxeBurguer extends Hamburguer{
    private boolean hasSoda;
    private boolean hasFries;

    public DeluxeBurguer(String breadRollType, boolean hasMeat, float price) {
        super(breadRollType, hasMeat, price);
        this.hasSoda = true;
        this.hasFries = true;
    }

    private float calculateDeluxePrice() {
        float tempPrice = 0f;

        if (this.hasFries) {
            tempPrice += 1.00f;
        }

        if (this.hasSoda) {
            tempPrice += 1.00f;
        }

        return tempPrice;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + calculateDeluxePrice();
    }
}
