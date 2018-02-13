package com.company;

public class Main {

    public static void main(String[] args) {
//	    BankAccount marcoBankAccount = new BankAccount(1, 1000, "Marco Ramirez",
//                "marco@gmail.com, ", "1111-1111");
//	    BankAccount rominaBankAccount = new BankAccount(2, 2000, "Romina Guzman",
//                "romina@gmail.com", "2222-2222");
//
//	    BankAccount timBankAccount = new BankAccount("Tim", "email", "phone");
//
//        System.out.println(timBankAccount.getNumber() + " name: " + timBankAccount.getCustomerName());
//
//	    marcoBankAccount.depositFunds(1000);
//	    marcoBankAccount.withdrawFunds(500);
//	    rominaBankAccount.depositFunds(2000);
//	    rominaBankAccount.withdrawFunds(100);

        VipCustomer marco = new VipCustomer("Marco", 1000.0f, "marco@email.com");
        VipCustomer romina = new VipCustomer("Romina", 2000.0f);
        VipCustomer defaultUser = new VipCustomer();

        System.out.println("customer 1 name: " + marco.getName());
        System.out.println("customer 1 creadit limit: " + marco.getCreditLImit());
        System.out.println("customer 1 email: " + marco.getEmailAddress());

        System.out.println("customer 2 name: " + romina.getName());
        System.out.println("customer 2 creadit limit: " + romina.getCreditLImit());
        System.out.println("customer 2 email: " + romina.getEmailAddress());


        System.out.println("customer 3 name: " + defaultUser.getName());
        System.out.println("customer 3 creadit limit: " + defaultUser.getCreditLImit());
        System.out.println("customer 3 email: " + defaultUser.getEmailAddress());
    }
}
