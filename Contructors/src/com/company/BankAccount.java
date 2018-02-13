package com.company;

public class BankAccount {
    private int number;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this(56789, 0.0f, "Default name", "Default address", "default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, float balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55f, customerName, email, phoneNumber);
    }

    // GET functions
    public float getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // SET functions
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(float deposit) {
        this.balance += deposit;
        printBalance();
    }

    public void withdrawFunds(float withdraw) {
        if(this.balance - withdraw < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdraw;
            printBalance();
        }
    }

    private void printBalance() {
        System.out.println("CUSTOMER: " + customerName);
        System.out.println("New Balance is: " + balance);
    }
}
