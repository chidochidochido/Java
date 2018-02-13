package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double displayCentimeters;
        double feet = 6;
        double inches = 1;

        displayCentimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if(displayCentimeters == -1) {
            System.out.println("Invalid parameters");
        } else {
            System.out.println("FEET: " + feet
                    + "    INCHES: " + inches
                    + "    CENTIMETERS: " + displayCentimeters);
        }

        inches = -100;
        displayCentimeters = calcFeetAndInchesToCentimeters(inches);
        if(displayCentimeters == -1) {
            System.out.println("Invalid parameters");
        } else {
            System.out.println("INCHES: " + inches
                    + "    CENTIMETERS: " + displayCentimeters);
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    // CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters;
        double totalInches;

        if((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }

        totalInches = feet * 12 + inches;
        centimeters = totalInches * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet;
        double centimeters;

        if(inches >= 0) {
            feet = (int)(inches / 12);
            inches = (int)(inches % 12);
            centimeters = calcFeetAndInchesToCentimeters(feet, inches);
            return centimeters;
        } else {
            return -1;
        }
    }
}
