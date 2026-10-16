package com.pluralsight;

import java.util.Scanner;

public class SandwichShopIterationOne {

    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);

        ///Declaring variables for color schemes so I can have consistent subway colors throughout
        ///my program

        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";

        ///declaring Variables for sandwich pricing
        double regularCost = 5.45;
        double largeCost = 8.95;
        ///Welcoming user into the program / sandwich shop. I'm using a formatted string
        ///to reference variables green, reset, yellow. I have color schemes stored in these
        ///variables and can use them to make my string certain colors.
        System.out.printf("Welcome to the %sSandwich%s%sShop%s!%n%n", green, reset, yellow, reset);


        ///Displaying sandwich size options to the user, using """ for lenient string format
        System.out.println("""
                
                Your options for size are: 
                Regular: $5.45
                Large: $8.95
                """);

        ///Asking the user what size of sandwich they want, and storing their answer with Scanner
        System.out.printf("What size of %ssandwich%s would you like? : ", green, reset);
        String sizeChoice = theScanner.nextLine();

        ///if statements with conditions and alternatives if they choose the Regular size,
        ///The Large size, or otherwise.
        if (sizeChoice.equalsIgnoreCase("Regular")) {
            System.out.printf("You have chosen a Regular sized %ssandwich%s!%n", green, reset);
        } else if (sizeChoice.equalsIgnoreCase("Large")) {
            System.out.printf("You have chosen a Large sized %ssandwich%s!%n", green, reset);

        } else {
            System.out.println("You have chosen something not available. Please try again.");
        System.exit(1);

        }
        ///Prompting the user for their age, for discounts.
        System.out.println("Please provide your age for possible discount eligibility: ");
        int userAge = theScanner.nextInt();

        ///if statements with conditions and alternatives depending on if they receive a discount
        if (userAge <= 17) {
        regularCost = regularCost * .90;
        largeCost = largeCost * .90;
        }else if (userAge >= 65) {
            regularCost = regularCost * .80;
            largeCost = largeCost * .80;

        }
        ///Final if/else if statements for printing cost to user depending on their earlier size
        ///choice
        if (sizeChoice.equalsIgnoreCase("Regular"))

    {
            System.out.printf("Your final charge is $%.2f%n", regularCost);
    }   else if (sizeChoice.equalsIgnoreCase("Large")) {
            System.out.printf("Your final charge is $%.2f%n", largeCost);
        }
    }
    }
