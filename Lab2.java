// Programmers:  Costa Marmaras, Sean
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Create a program that creates 10 different lottery tickets and the prize pool
// Data In: users name
// Data Out: 10 lottery tickets, a good luck message, the prize pool
// Credits: Notes #3, page 4

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {

        //Initialize prize and create objects from imports
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat twoDigits = new DecimalFormat("00");

        //Output purpose of code
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Prompt user to enter name
        System.out.print("What's your name? ");

        //Intake name from user and trim
        String customerName = input.nextLine().trim();

        //Check if name contains a break
        if(customerName.indexOf(' ') > 0) {
            //Take index of break and set customer name to first name
            int index = customerName.indexOf(' ');
            customerName = customerName.substring(0, index);
        }

        //Loop 10 times
        for (int i = 0; i < 10; i++) {
            //Loop 6 times
            for (int j = 0; j < 6; j++) {
                //Generate random number between 0 and 99
                int lotteryNumber = rand.nextInt(99);
                //Print random number using decimalformat
                System.out.print(twoDigits.format(lotteryNumber) + " ");
            }
            //Print new line
            System.out.println();
        }

        //Output final statement with estimated jackpot
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName +"!");
        System.out.println("Estimated Jackpot: ");
        System.out.println("$" + prize);
        System.out.println("-----------------");


    }
}
