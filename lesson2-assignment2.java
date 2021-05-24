package com.company;
public class Main {

    public static void main(String[] args) {
        int high = 0;                               //initialize variable for highest number
        int highIndexA = 0;                         //initialize variable for A index of highest number
        int highIndexB = 0;                         //initialize variable for B index of highest number
        int currentAIndex = 0;                      //initialize variable for current A index of array for looping
        int currentBIndex = 0;                          //initialize variable for current B index of array for looping
        int[][] myArray = {{1,5,3},{2,6,9},{7,8,4}};    //initialize [3][3] array with non-sequential values, 0-9
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0;j < myArray[i].length;j++) { //loops through every element in `myArray`
                int temp = myArray[i][j];
                if (temp > high) {                        //checks if the current value is larger than the set highest value
                    high = temp;                          //if so then sets `high` to the current value
                    highIndexA = currentAIndex;           //sets `highAIndex` to the current index of the new highest number
                    highIndexB = currentBIndex;           //sets `highBIndex` to the current index of the new highest number
                }
                currentBIndex++;                          //every iteration of the inner loop will increment `currentBIndex`

            }
            currentAIndex++;                              //every iteration of the outer loop will increment `currentAIndex`
            currentBIndex = 0;                            //after last element in an array is checked, currentBIndex is set back to 0
        }
        System.out.println("largest number in set is: "+ high + " and its index is: ["+highIndexA+"]["+highIndexB+"] item in the array");

    }
}
