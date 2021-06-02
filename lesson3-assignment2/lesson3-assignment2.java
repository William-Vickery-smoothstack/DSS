import java.io.BufferedWriter;                                       //import required classes
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                        //create a scanner used to get user input
        try {
            if (args.length != 0) {                                 //checks if an arguments is given
                appendStringToFileRelative(args[0],sc);             //if argument is given appendStringToFileRelative() is called with the argument(file path)
                sc.close();                                         //close scanner 
            }
        }
        catch (Exception e) {
            if (args.length > 0) {                                  //checks if argument is given
                appendStringToFileAbsolute(sc);                     //calls appendStringToFileAbsolute() so full path can be entered
                sc.close();                                         //close scanner
            }
            else {
                sc.close();                                         //close scanner
                e.printStackTrace();                                //if unhandled exception is thrown then print stack trace
            }
        }
    }
    public static void appendStringToFileRelative(String filename, Scanner sc) {
        try {
            String path = (new File("").getAbsolutePath())+"/"+filename;                   //gets path of directory the java program is running from
            System.out.println(path);                                                      //prints the path to the screen
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));     //creats a buffered writer object on the file given with append parameter set to true
            System.out.print("\nEnter text to append: ");                                  //promt user to enter text to append to file
            String addition = sc.nextLine();                                               //stores user input into a string `addition`
            writer.write("\n"+addition+"\n");                                              //appends input given on a new line, a new line is then added
            writer.close();                                                                //closes the buffered writer
        }
        catch (Exception e) {
            e.printStackTrace();                                                           //if unhandled exception is thrown print stack trace
        }
    }
    public static void appendStringToFileAbsolute(Scanner sc) {                            //if using a relative path fails, this function allows user to enter full path to file
        String path = null;                                                                //initalizes a string `path` used to store path as null
        try {                                         
            System.out.print("\nThere was a problem. Enter full path to file: ");          //prompt user to enter full path to file
            path = sc.nextLine();                                                          //sets `path` to users input
            BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));         //creats a buffered writer object on the file given with append parameter set to true
            System.out.print("\nEnter text to append: ");                                  //promt user to enter text to append to file
            String addition = sc.nextLine();                                               //stores user input into a string `addition`
            writer.write("\n"+addition+"\n");                                              //appends input given on a new line, a new line is then added
            writer.close();                                                                //closes the buffered writer
        }
        catch (Exception e) {
            if (path != null) {                                                            //if an unhandled exception is thrown checks if `path` has been set
                appendStringToFileAbsolute(sc);                                            //if `path` is set calls the function again to allow user to re-enter path
            }
            else {
                e.printStackTrace();                                                       //if path is null print stack trace
            }
        }
    }

}
