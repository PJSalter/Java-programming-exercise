package com.sg.foundations.userinput;

import java.util.Scanner;

public class QuestForTheUserInput {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double shoppingListPrice;

        // I can use the Scanner's readLine to assign value to my strings.
        // because it's return type is string.
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();

        // When I get the double data type, I can use the Scanner's nextDouble method.


        System.out.println("What was the cost of your last shopping list?!?! ");
        // I can use the Double.parseDouble to convert the nextLine's String.
        shoppingListPrice = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("Why did you spend " + shoppingListPrice + " on that much shopping, " + yourName + "?");
        System.out.println("That is an insane amount of money!");
        System.out.println("Maybe skip being sad about money and instead go " + yourQuest + ".");
    }

}
