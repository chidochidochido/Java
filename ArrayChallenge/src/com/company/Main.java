package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Reading numbers from keyboard
        int[] inputIntArray = new int[5];
        getIntegers(inputIntArray);
        sortArray(inputIntArray);
        printArray(inputIntArray);
    }

    public static void getIntegers(int[] inputArray) {
        System.out.println("Enter " + inputArray.length + " integers: ");

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = myScanner.nextInt();
        }
    }

    public static void printArray(int[] inpuyArray) {
        System.out.println("Sorted numbers: ");

        for (int i = 0; i < inpuyArray.length; i++) {
            System.out.printf("%d ", inpuyArray[i]);
        }

        System.out.println();
    }

    public static void sortArray(int[] inputArray) {
        int tempSwapVal;

        for (int i = 0; i < (inputArray.length - 1); i++) {
            for (int j = 0; j < (inputArray.length - 1 - i); j++) {
                if (inputArray[j] < inputArray[j + 1]) {
                    tempSwapVal = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = tempSwapVal;
                }
            }
        }
    }
}
