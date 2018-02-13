package com.company;

public class HealthyBurguer extends Hamburguer {
    private boolean hasJalapeno;
    private boolean hasMustard;
    private float addedPrice;

    public HealthyBurguer() {
        super("Brown Ryw", true, 4.00f);
        this.hasJalapeno = false;
        this.hasMustard = false;
        this.addedPrice = 0.00f;

    }

    public void setHasJalapeno(boolean hasJalapeno) {
        this.hasJalapeno = hasJalapeno;
    }

    public void setHasMustard(boolean hasMustard) {
        this.hasMustard = hasMustard;
    }

    private float calculateHealthyPrice() {
        float tempPrice = 0f;

        if(this.hasJalapeno) {
            tempPrice += 1.00;
        }

        if(this.hasMustard) {
            tempPrice += 1.00;
        }

        return tempPrice;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + calculateHealthyPrice();
    }
}
