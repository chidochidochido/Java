package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburguer normalHamburguer = new Hamburguer("White", true, 3.00f);
        System.out.println("1 - Normal Hambuguer Price: " + normalHamburguer.getPrice());
        normalHamburguer.setHasCarrot(true);
        normalHamburguer.setHasLettuce(true);
        System.out.println("2 - Normal Hambuguer Price: " + normalHamburguer.getPrice());

        HealthyBurguer myHealthyBurguer = new HealthyBurguer();
        System.out.println("1 - Healthy Hambuguer Price: " + myHealthyBurguer.getPrice());
        myHealthyBurguer.setHasCarrot(true);
        myHealthyBurguer.setHasLettuce(true);
        System.out.println("2 - Healthy Hambuguer Price: " + myHealthyBurguer.getPrice());
        myHealthyBurguer.setHasJalapeno(true);
        myHealthyBurguer.setHasMustard(true);
        System.out.println("3 - Healthy Hambuguer Price: " + myHealthyBurguer.getPrice());


        DeluxeBurguer myDeluxeBurguer = new DeluxeBurguer("White", true, 3.00f);
        System.out.println("1 - Deluxe Hambuguer Price: " + myDeluxeBurguer.getPrice());
        myDeluxeBurguer.setHasCarrot(true);
        myDeluxeBurguer.setHasLettuce(true);
        System.out.println("2 - Deluxe Hambuguer Price: " + myDeluxeBurguer.getPrice());
    }
}
