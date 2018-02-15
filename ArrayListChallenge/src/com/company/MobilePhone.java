package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> myContacts = new ArrayList<Contacts>();
    private Scanner myScanner = new Scanner(System.in);
    private boolean displayMenu;
    private int userOption;

    public MobilePhone() {
        this.displayMenu = true;
    }

    public void displayOptionsMenu() {
        System.out.println("Mobile Phone Options: ");
        System.out.println("1. Repeat Menu");
        System.out.println("2. Print list of contacts");
        System.out.println("3. Add new contact");
        System.out.println("4. Update contact");
        System.out.println("5. Remove contact");
        System.out.println("6. Search contact");
        System.out.println("7. Quit");
        System.out.print("Your option: ");
        this.userOption = this.myScanner.nextInt();
        this.myScanner.nextLine();
    }


    public void printListOfContacts () {
        for(int i = 0; i < this.myContacts.size(); i++) {
            this.myContacts.get(i).printContact();
        }
    }

    public void addNewContact() {
        String contactName;
        String contactPhoneNumber;

        System.out.print("Input contact name: ");
        contactName = myScanner.nextLine();
        System.out.print("Input Phone Number: ");
        contactPhoneNumber = myScanner.nextLine();

        myContacts.add(new Contacts(contactName, contactPhoneNumber));
    }

    public void updateContact () {
        Contacts myLocalContact;
        String contactName;
        boolean found;

        System.out.println("Enter Contact Name: ");
        contactName = this.myScanner.nextLine();

        for (int i = 0; i < this.myContacts.size(); i++) {
            myLocalContact = this.myContacts.get(i);

            if (contactName == myLocalContact.)
        }
    }

    public int searchContact

    public void quit() {
        this.displayMenu = false;
    }

    public boolean getDisplayMenu() {
        return displayMenu;
    }

    public int getUserOption() {
        return userOption;
    }



    public static void removeContact() {

    }

//    public static void searchContact() {
//
//    }
}
