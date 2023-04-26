package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int counter = 11;
        int sum = 0;
        System.out.println("counting down...");
        while (sum < counter){

            System.out.println(--counter);

        }
        System.out.println("Blast off!");

        int startingValue = 0;
        while (startingValue <= 0) {
            System.out.print("What number should I count down from? ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a positive integer: ");
                scanner.next();
            }
            startingValue = scanner.nextInt();
        }

        System.out.println("\nHere goes!");

        int count = startingValue;
        while (count >= 0) {
            System.out.print(count + " ");
            if (count % 10 == 0){
                System.out.println();
            }
            count--;
        }
        System.out.println("\nBlast off!");
    }
}
