/*
Name: Amarren Hopkins
Date: 4/22/26
Assignment SDC330L Week 1 Project Inheritance, Composition, and User interactions
This is the Checking class for users to be able to choose if they 
want a checking account when they make their bank account */
public class Checking extends Account{
    private static final double OVERDRAFT = 500;

    public Checking(String accountNum, double balance, User user) {
        super(accountNum, balance, user);
    }
    
    //display override
    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: Checking");
        System.out.println("\nOverdraft limit: $"+OVERDRAFT);
    }
}
