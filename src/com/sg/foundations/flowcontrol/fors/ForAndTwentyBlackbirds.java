package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        int birdsInPie = 0;

        // Iterating through 0 - 20 plussing one each time.
        // I changed the starting point to 1 instead of 0.
        // I then changed the loop count so that it is more traditional to twenty-four birds.
        for (int i = 1; i < 25; i++){
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
