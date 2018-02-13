package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 6;
//	    while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }

//        count = 1;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count != 6);

        // CHALLENGE

        int number = 7;
        int finishNumber = 20;
        int totalEvenNumbers = 0;

        while(number <= finishNumber) {
            if(isEvenNumber(number)) {
                System.out.println("Even number " + number);
                totalEvenNumbers++;
            }

            if(totalEvenNumbers >= 5) {
                break;
            }

            number++;
        }

        System.out.println("Total of even numbers found: " + totalEvenNumbers);
    }

    //CHALLENGE

    public static boolean isEvenNumber(int testNumber) {
        if(testNumber % 2 == 0) {
            return true;
        }

        return false;
    }
}
