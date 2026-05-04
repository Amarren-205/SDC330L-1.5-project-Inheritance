/*
Name: Amarren Hopkins
Date: 4/22/26
Assignment SDC330L Week 1 Project Inheritance, Composition, and User interactions
This is the Savings class which is basically the same as the Checking
except Checking and Savings have two different set variables that affect 
their balance.*/
public class Savings extends Account{
    private static final double INTEREST = 0.04;

    public Savings(String accountNum, double balance, User user) {
        super(accountNum, balance, user); 
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: Savings");
        System.out.println("\nInterest rate: %"+(INTEREST * 100)+ "%");
    }
}
