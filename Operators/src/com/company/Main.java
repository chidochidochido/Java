package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);;

        previousResult = result;

        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;

        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result++;

        System.out.println("Result is now " + result);

        result--;

        System.out.println("Result is now " + result);

        result += 2;

        System.out.println("Result is now " + result);

        result *= 10;

        System.out.println("Result is now " + result);

        result -= 10;

        System.out.println("Result is now " + result);

        result /= 10;

        System.out.println("Result is now " + result);

        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an Alien!");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less
        System.out.println("EXERCISE");


        double myDoubleVar = 20d;
        double mySecondDoubleVar = 80d;
        double myResult = (myDoubleVar + mySecondDoubleVar) * 25d;
        System.out.println("myDoubleVar + mySecondDoubleVar) * 25 = " + myResult);
        myResult %= 40d;
        System.out.println("myResult is now " + myResult);

        if(myResult <= 20)
            System.out.println("Total was over the limit");


    }
}
