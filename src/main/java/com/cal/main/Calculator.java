package com.cal.main;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.welcome();


    }

    public void welcome() {
        System.out.println("\f");
        System.out.println("welcome to your personal finance assistant");
        System.out.println("Please select the following option: " + "\n" + "Enter 1 if Buying a new car" + "\n" + "Enter 2 if Buying a home");
        // create a scanner so we can read the command-line input


        int option = scanner.nextInt();

        switch (option) {
            case 1:
                this.calculateCar();
                break;
            case 2:
                this.calculateHome();
                break;
        }
    }

    private void calculateCar() {
        this.clearScreen();

        System.out.println("\f");
        System.out.println("Lets begin ..... \n");
        System.out.println("what is you net income ? e.g. 7500.00 \n");
        double income = scanner.nextDouble();

        System.out.print("what are your total momtly expenses? e.g 1500.00 \n");
        double expenses = scanner.nextDouble();

        if (income < expenses){
            System.out.print("You should not be buying a car !!! pay off your debt \n");
            System.exit(0);
        }

        System.out.println("How much is the car you wish to purchase ? e.g. 150000.00 \n");
        double carPrice = scanner.nextDouble();

        String InstallmentOpitons = this.calculateInstallment(income,expenses,carPrice,"car");




    }

    private String calculateInstallment(double income, double expenses, double carPrice, String car) {
        String installmentOptions= "Oops !!!";

        return installmentOptions;
    }



    private void calculateHome() {

    }

    private void clearScreen() {
        try {
            Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
