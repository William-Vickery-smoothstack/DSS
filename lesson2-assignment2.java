package com.company;
public class Main {

    public static void main(String[] args) {
        int high = 0;                               //initialize variable for highest number
        int highIndex = 0;                          //initialize variable for index of highest number
        int currentIndex = 0;                       //initialize variable for current index of array for looping
        int[] myArray = {1,5,3,2,6,9,7,8,4,0};      //initialize array with non-sequential values, 0-9
        for (int i: myArray) {                      //loops through every element in `myArray`
            if (i > high) {                         //checks if the current value is larger than the set highest value
                high = i;                           //if so then sets `high` to the current value
                highIndex = currentIndex;           //sets `highIndex` to the current index of the new highest number
            }
            currentIndex++;                         //every iteration of the loop will increment `currentIndex`
        }
        System.out.println("largest number in set is: "+ high + " and its index is: "+ highIndex + " or the "+ (highIndex + 1) + "th item in the array");

    }
}
