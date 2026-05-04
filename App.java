/*
Name: Amarren Hopkins
Date: 4/22/26
Assignment SDC330L Week 1 Project Inheritance, Composition, and User interactions
This is the main application */
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAmarren Hopkins Week 1 Project \n");
        //introduction 
        System.out.println("    Welcome to Amarren Banking\n");
        System.out.println("This program will allow you to view created bank information\n");
        Scanner input = new Scanner(System.in);
        int counter;
        //getting user inputs for the account
        System.out.println("How many accounts do you want?");
        counter = input.nextInt();
        input.nextLine();
        //Array to hold accounts aswell as loop to get the account information
        ArrayList<Account> accounts = new ArrayList<>();
       
        int loop = 0;
        while(loop < counter){
            System.out.println("What is your name? ");
            String name = input.nextLine();
            User user = new User(name);
            
            System.out.println("What would you like your account number to be?" );
            String accountNum = input.nextLine();

            System.out.println("How much money would you like to put in if any? ");
            double bal = input.nextDouble();

            System.out.println("What type of account will this be? (1 = checking 2 = savings)");
            int accType = input.nextInt();

            //if and elses for the account types to create correct acount
            if(accType == 1 ){
                accounts.add(new Checking(accountNum, bal, user));
            } else{
                accounts.add(new Savings(accountNum, bal, user));
            }
            input.nextLine();
            loop++;
        }
        //displaying all accounts information
        loop = 0;
        while(loop < accounts.size()){
            accounts.get(loop).display();
            loop++;
        }
    }
}
