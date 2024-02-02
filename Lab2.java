// Programmers:  Costa Marmaras, Sean
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Create a program that creates 10 different lottery tickets and the prize pool
// Data In: users name
// Data Out: 10 lottery tickets, a good luck message, the prize pool
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //The different number formats needed for this
        DecimalFormat twoDigits = new DecimalFormat("00");
        DecimalFormat money = new DecimalFormat("$.00");
        DecimalFormat winnings = new DecimalFormat("$#,###.##");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //asks for the name of the user and the money that they would like to play
        System.out.print("What's your name? ");
        String customerName = input.nextLine().trim();

        System.out.println("How much money would you like to play?");
        double bet = input.nextDouble();

        //seperates the last name from the middle name
        if(customerName.indexOf(' ') > 0) {
            int index = customerName.indexOf(' ');
            customerName = customerName.substring(0, index);
        }

        System.out.println("Great! " + customerName + " wants to play " + money.format(bet) + "!");
        System.out.println("\nHere are the tickets\n-----------------");

        //loops 10 times for the 10 tickets, loops 6 times inside for the 6 numbers for each tickets numbers
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int lotteryNumber = rand.nextInt(99);

                /*
                switch statement which will put the bet to the power of 1.75 if it is one of the winning numbers
                */
                switch(lotteryNumber)
                {
                    case 3, 5, 11, 16, 58, 59:
                        bet = Math.pow(bet, 1.75);
                        break;
                }
                System.out.print(twoDigits.format(lotteryNumber) + " ");
            }
            System.out.println();
        }

        //final goodbye and goodluck message, displays the users winnings
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName +"!");
        System.out.println("-----------------");
        System.out.println("Your winnings are " + winnings.format(bet));
        System.out.println("-----------------");

    }
}
