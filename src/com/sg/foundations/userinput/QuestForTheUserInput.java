package com.sg.foundations.userinput;

import java.util.Scanner;

public class QuestForTheUserInput {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double velocityOfSwallow;

        // I can use the Scanner's readLine to assign value to my strings.
        // because it's return type is string.
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();

    }
}
