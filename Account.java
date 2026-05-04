/*
Name: Amarren Hopkins
Date: 4/22/26
Assignment: SDC330L 1.5 Project - Inheritance, Composition, and User interactions
This is the base class or parent class 
The purpose of this class is to take user input to create objects that will represent their bank account*/
public class Account {
    private String AccountNum;
    private double Balance;
    private User User;

    public Account(String accountNum, double balance, User user){
        AccountNum = accountNum;
        Balance = balance;
        User = user;
    }
    public String getAccountNum() {
        return AccountNum;
    }
    public void setAccountnum(String accountNum){
        AccountNum = accountNum;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public User getUser(){
        return User;
    }
    public void setUser(User user){
        User = user;
    }
    //display method not sure if I could have used a toString but i prefer and 
    //am more comfortable with display methods
    public void display() {
        System.out.println("    Account Information    ");
        System.out.println("Name: "+User+
    "\nAccount number: "+AccountNum+
    "\nBalance: $"+Balance);
    }
}
