package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String[] args){

        int timeNow = 5;
        int bedTime = 10;

        // condition that will check while timeNow 5 o'clock is less than bedtime 10 o'clock
        // then run the while
        // runs the prints messages
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            // iterates 1 each time. the time moves up an hour each time.
            timeNow++;  // Time passes
        }
        // print out the bedtime messages. end point time.
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");

    }
}
