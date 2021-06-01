import java.io.File;                                    //import required classes
import java.io.FileReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //creates a scanner object to pass to functions (needed for multiple System.in stream access).
        getChar(sc);                                    //calls getChar() to get letter from user and call seekChar() with the letter
        sc.close();                                     //close scanner
    }

    public static void getChar(Scanner sc) {
        try {
            System.out.print("Enter a character to seek: ");    //prompt user for letter
            String input = sc.next();                           //store input letter as string for easy checking
            if (input.length() == 1) {                          //checks if input was 1 character
                char letter = input.charAt(0);                  //if true assigns a new char `letter` to the value of the 0th indexed char in the input
                seekChar(letter);                               //then call seekChar with `letter`
            }
            //else if (input.length() < 1) {                    //checks if user did not supply input
                //getChar(sc);                                  //calls getChar() with `sc` to let user re-enter letter
           // }                                                 //Scanner class already implements a similar behavior
            else {                                              //checks if more than 1 character is input
                    System.out.println("\nPlease enter a single character.\n"); //prompt user to enter single character
                    getChar(sc);                                //call getChar() with `sc` to let user re-enter letter
                }
        }
        catch (Exception e) {
            e.printStackTrace();                               //if  unhandled exception is thrown, print stack trace
        }

    }

    public static void seekChar(char seek) {
        try {
            int occurrences =0;                                 //initialize an int variable to count occurrences of letter
            StringBuilder content = new StringBuilder();        //create StringBuilder object to store contents of the file
            String f = new File("").getAbsolutePath();          //gets path to working directory
            Scanner sc = new Scanner(new FileReader(f+"/file.txt")); //creates a scanner object with the file
            while (sc.hasNextLine()) {                          //check if the file has another line
                content.append("\n").append(sc.nextLine());     //if file hasNextLine() is true then we append the line to our StringBuilder `content`
            }
            char[] arr = content.toString().toCharArray();      //create a char array of `content` to check for matching letters 
            for (char a: arr) {                                 //loop through all characters in the content of the file 
                if(a == seek) {                                 //check if letter in the array is equal to letter specified
                    occurrences++;                              //if so, then increment the occurrence counter
                }
            }
            System.out.println("\nOccurrences: "+occurrences+" '"+seek+"'(s) in file 'file.txt'"); //print occurrences to screen 
            sc.close();                                         //close scanner
        }
        catch (Exception e){
            e.printStackTrace();                                //if unhandled exception is thrown, print stack trace 
        }
    }
}
