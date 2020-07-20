package com.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static double balance;
    public static void main(String[] args) {
        int option = 1;
        //Ask the user what kind of operation they want to perform
        while(option != 0 ){
	    Scanner scanner = new Scanner(System.in);
    	System.out.print("Please select an operation. Terminate (0), Deposit(1), Withdraw(2), Check Balance(3): ");
    	option = scanner.nextInt();
    	//If Deposit is choosen
	    if (option == 1) {
            //Asks the user how much they would like to deposit
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Please enter the amount you would like to Deposit: (Example format: 16.32 = $16.32): ");
            double deposit = scanner2.nextDouble();
                if (deposit < 1.00) {
                    System.out.println("You must deposit at least $1, please try again");
                    deposit = 0.0;
                } else {
                    balance = balance + deposit;
                    System.out.println("Deposit Successful");
                }
            }

	    //If Withdraw is chosen
	    if (option == 2) {
	        //Asks the user how much they would like to withdraw
	        Scanner scanner3 = new Scanner(System.in);
            System.out.print("Please enter the amount you like to Withdraw: (Example format: 17.55 = $17.55): ");
            double withdraw = scanner3.nextDouble();
                if (withdraw > balance) {
                    System.out.println("You do not have enough balance to withdraw this amount, please try again.");
                } else {
                    balance = balance - withdraw;
                    System.out.println("Withdraw Successful");
                }
            }
        }
	    //Checks the balance and prints it to the user
	    if (option == 3) {
	        String currency = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println("Your current balance is " + currency);
        }
        }

    }
}
