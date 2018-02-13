package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> myContacts = new ArrayList<Contacts>();
    private Scanner myScanner = new Scanner(System.in);

    public static void quit() {

    }

    public static void printListOfContacts () {
        for(int i = 0; i < this.myContacts.size(); i++) {
            printContact(i);
        }
    }

    public static void addNewContact() {
        Contacts myContact = new Contacts();
        System.out.print("New Name: ");


        this.myContacts.add();
    }

    public static void updateContact () {

    }

    public static void removeContact() {

    }

    public static void searchContact() {

    }
}
