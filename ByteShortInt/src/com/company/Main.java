package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteVar = 100;
        short myShortVar = 1000;
        int myIntVar = -1000;
        long myLongVar = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
        System.out.println("myLongVar = " + myLongVar);
    }
}
