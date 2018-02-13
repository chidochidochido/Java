package com.company;

public class Main extends Object{

    public static void main(String[] args) {
	    Pickup outlander = new Pickup(36);
	    outlander.steer(45);
	    outlander.accelerate(30);
	    outlander.accelerate(20);
	    outlander.accelerate(-42);
    }
}
