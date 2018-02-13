package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUptoner(int amount){
        this.tonerLevel += amount;
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplexPrinter) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
