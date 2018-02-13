package com.company;

public class VipCustomer {
    String name;
    float creditLImit;
    String emailAddress;

    public VipCustomer(String name, float creditLImit, String emailAddress) {
        this.name = name;
        this.creditLImit = creditLImit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("Default Customer", 0.0f, "default@email.com");
    }

    public VipCustomer(String name, float creditLImit) {
        this(name, creditLImit, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public float getCreditLImit() {
        return creditLImit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
