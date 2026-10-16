package com.pluralsight;

import java.util.Scanner;

public class SandwichShopIterationTwo {

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
        System.out.printf("""
                
                Your options for size are: 
                Regular: $%.2f
                Large: $%.2f
                """, regularCost, largeCost);

        ///Asking the user what size of sandwich they want, and storing their answer with Scanner
        System.out.printf("What size %ssandwich%s would you like? : ", green, reset);
        String sizeChoice = theScanner.nextLine();

        ///select the sandwich and its price
        double finalCost;

        ///if statements with conditions and alternatives if they choose the Regular size,
        ///The Large size, or otherwise.
        if (sizeChoice.equalsIgnoreCase("Regular")) {
            finalCost = regularCost;
            System.out.printf("You have chosen a Regular sized %ssandwich%s!%n", green, reset);
        } else if (sizeChoice.equalsIgnoreCase("Large")) {
            finalCost = largeCost;
            System.out.printf("You have chosen a Large sized %ssandwich%s!%n", green, reset);

        } else {
            System.out.println("You have chosen something not available. Please try again.");
            theScanner.close();
            return;
        }
        ///Prompting the user for their age, for discounts.
        System.out.println("Please provide your age for possible discount eligibility: ");
        int userAge = theScanner.nextInt();

        ///if statements with conditions and alternatives depending on if they receive a discount
        if (userAge <= 17) {
            finalCost *= .90;
            System.out.println("You received a 10% discount!");
        }else if (userAge >= 65) {
            finalCost *= .80;
            System.out.println("You received a 20% senior discount!");
        }

        ///Final charge displayed
        System.out.printf("Your final charge is $%.2f%n", finalCost);

        theScanner.close();
    }
}
