package com.company;

public class Hamburguer {
    private String breadRollType;
    private boolean hasMeat;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasCarrot;
    private boolean hasOnion;
    private float price;

    public Hamburguer(String breadRollType, boolean hasMeat, float price) {
        this.breadRollType = breadRollType;
        this.hasMeat = hasMeat;
        this.price = price;
        this.hasLettuce = false;
        this.hasTomato  = false;
        this.hasCarrot  = false;
        this.hasOnion   = false;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public void setHasCarrot(boolean hasCarrot) {
        this.hasCarrot = hasCarrot;
    }

    public void setHasOnion(boolean hasOnion) {
        this.hasOnion = hasOnion;
    }

    public float getPrice() {
        return this.price + calculatePrice();
    }

    private float calculatePrice () {
        float tempPrice = 0f;

        if (this.hasOnion) {
            tempPrice += 1.00f;
        }

        if (this.hasCarrot) {
            tempPrice += 1.00f;
        }

        if (this.hasTomato) {
            tempPrice += 1.00f;
        }

        if (this.hasLettuce) {
            tempPrice += 1.00f;
        }

        return tempPrice;
    }
}


