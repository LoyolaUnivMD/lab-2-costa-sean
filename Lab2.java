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
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat twoDigits = new DecimalFormat("00");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");

        String customerName = input.nextLine().trim();
        if(customerName.indexOf(' ') > 0) {
            int index = customerName.indexOf(' ');
            customerName = customerName.substring(0, index);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int lotteryNumber = rand.nextInt(99);
                System.out.print(twoDigits.format(lotteryNumber) + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName +"!");
        System.out.println("Estimated Jackpot: ");
        System.out.println("$" + prize);
        System.out.println("-----------------");


    }
}
