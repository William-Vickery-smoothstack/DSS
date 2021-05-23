package com.company;

public class Main {

    public static void main(String[] args) {
        printPattern1();        //calls the functions to print the patterns in sequence
        printPattern2();
        printPattern3();
        printPattern4();
    }


    private static void printPattern1() {
        int count = 0;                          //store the number of '*' to be printed on the iteration
        System.out.print("1)\n");
        for (int i = 0; i < 4; i++) {           //4 rows of '*' are to be printed
            count++;                            //increment `count`
            System.out.print("\n");             //adds new line after '*'(s) are printed
            for (int j = 0; j < count; j++) {   //prints '*' `count` times
                System.out.print("*");
            }
        }
        System.out.println("\n.........\n");
    }

    private static void printPattern2() {       //implements pattern 1 but in revers order
        int count = 5;
        System.out.print("2)\n");

        System.out.println("..........\n");
        for (int i = 4; i > 0; i--) {           //4 rows of '*' to be printed
            count--;                            //`count` decrements
            for (int j = 0; j < count; j++) {
                System.out.print("*");          //prints '*' `count` times
            }
            System.out.println("\n");
        }
    }


    private static void printPattern3() {
        int count = 1;                             //stores number of '*' to print on an iteration
        int spaceCount = 5;                        //stores the number of spaces required to pad the '*'(s) on a line
        System.out.print("3)\n");
        for (int i = 0; i < 4; i++) {               //4 rows of '*' to be printed
            System.out.print("\n");
            for (int j =0; j < spaceCount;j++){    //this loop prints the space padding
                System.out.print(" ");
            }
            spaceCount--;                           //amount of space padding is decremented
            for (int k = 0; k!=count; k++) {        //prints '*' `count` times
                System.out.print("*");
            }
            count += 2;                             //adds 2 to `count`
        }
        System.out.print("\n...........\n");

    }

    private static void printPattern4() {           //implements pattern 3 but in reverse order
        int count = 7;
        int spaceCount = 2;
        System.out.print("4)\n");
        System.out.print("\n...........");
        for (int i = 0; i < 4; i++) {               //4 rows of '*' to be printed
            System.out.print("\n");
            for (int j =0; j < spaceCount;j++){     //prints space padding
                System.out.print(" ");
            }
            spaceCount++;                           //amount of space padding is incremented
            for (int k = 0; k!=count; k++) {        //prints '*' `count` times
                System.out.print("*");
            }
            count -= 2;
        }
    }


}





