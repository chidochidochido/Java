package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(50, false);

        System.out.println("Initial page count = " + myPrinter.getNumberOfPagesPrinted());

        int pagesPrinted = myPrinter.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + " # of pages printed: "
                + myPrinter.getNumberOfPagesPrinted());

        pagesPrinted = myPrinter.printPages(2);
        System.out.println("Pages printed was: " + pagesPrinted + " # of pages printed: "
                + myPrinter.getNumberOfPagesPrinted());

        myPrinter.fillUptoner(60);
        System.out.println("New toner level: " + myPrinter.getTonerLevel());

        myPrinter.fillUptoner(60);
        System.out.println("New toner level: " + myPrinter.getTonerLevel());


    }
}
