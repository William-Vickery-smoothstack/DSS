package com.company;

public class Main {

    public static void main(String[] args) {    //takes any amount of arguments and prints the sum
        int total = 0;                          //initialize total to 0
        for (String s: args) {                  //loops through args[] for however may elements are contained within
            try {
                if (args[0] != null){           //checks for at least one argument to be given
                    int temp = Integer.parseInt(s); //converts the string argument into a integer and stores the value in `temp`
                    total += temp;              //adds the converted integer to `total`
                }
                else {
                    System.out.println("\nYou provided no/invalid arguments\n");
                }
            }
            catch (Exception e) {               //catches exceptions thrown if input is invalid
                System.out.println("\nthis program only accepts integers as arguments\n");
                System.exit(0);          //were just going to exit if input is invalid
            }
        }
        System.out.println(total);              //prints the sum of the arguments
    }
}
/*
I just want to add that "Take multiple values from the command line and show the result of adding all of them."
is very ambiguous. Here within is my best shot of depicting this.
 */