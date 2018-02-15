package com.company;

public class Main {

    public static void main(String[] args) {
	    MobilePhone myMobilePhone = new MobilePhone();

	    while(myMobilePhone.getDisplayMenu()) {
            myMobilePhone.displayOptionsMenu();

            switch (myMobilePhone.getUserOption()) {
                case 1: myMobilePhone.displayOptionsMenu(); break;
                case 2: myMobilePhone.printListOfContacts(); break;
                case 3: myMobilePhone.addNewContact(); break;
                case 7: myMobilePhone.quit(); break;
                default: myMobilePhone.quit();
            }
        }
    }
}
