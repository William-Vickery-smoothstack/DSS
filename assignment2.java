package com.company;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
       int guess = getGuess();                      //calls getGuess() and stores returned value into `guess`
       int answer = getAnswer();                    //calls getAnswer() and stores returned value into `answer`
       checkGuess(guess,answer,1);            //calls checkGuess() with our guess, answer and indicates this is our first try

    }
    static int getAnswer() {
        Random random = new Random();               //creates Random object
        int answer = random.nextInt(100);    //generates a random number from 0-100
        if (answer == 0) answer++;                  //checks if the answer is 0, if so it will return 1
        return answer;
    }

    static int getGuess() {
        System.out.print("Guess a number 1-100 :  ");
        Scanner sc = new Scanner(System.in);            //create Scanner object to read input from stdin(System.in)
        int guess = 0;                                  //initialize guess to 0
        try {                                           //try block will catch any Exceptions thrown due to invalid input
            guess = sc.nextInt();                       //will read an integer from stdin(System.in)
        }
        catch (Exception e) {                           //catch block will catch an exception and continue execution in a determined manner
            System.out.println("\nError: "+ e.toString() +" \nInput only integers\n");   //prints the exception type and reminds user to only input integers
            getGuess();                                 //calls getGuess() again if your input is invalid
        }
        return guess;
    }

    static void checkGuess(int guess, int answer, int tries) {  //designed to recursively check if guess is +-10 from answer
        if (tries < 5){                                 //check to see if we are out of tries
            if (Math.abs(guess - answer) <= 10){        //checks if the guess is +-10 from the answer
                System.out.println("\n The answer was: "+ answer);
                System.exit(0);                  //performs exit syscall with value 0 for errorless execution
            }
            else {
                System.out.print("Sorry, try again! ");
                int nextGuess = getGuess();            //calls getGuess() again and stores returned value in `nextGuess`
                checkGuess(nextGuess,answer,tries+1); //calls checkGuess recursively with new guess and increments `tries`
            }

        }
        else {
            System.out.println("\nSorry, the answer was: "+ answer); //if guess is not +-10 in 5 tries, prints the answer and exits
            System.exit(0);
            /*
             System.exit(0);
             ^^^this is not needed, however:
             1) instructions explicitly say to exit in this case.
             2) gets rid of a 'ret' op code that can potentially be abused (even though there are quite a few in this program already)
              the fewer 'ret's the safer theoretically
             */
        }
    }

}
