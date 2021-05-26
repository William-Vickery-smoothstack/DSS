import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> files = new ArrayList<>();    //creates new list of strings to store file names
    public static void main(String[] args) {
        try {
            File f = new File(args[0]);               //creates file object from path given from command line
            if (f.exists()) {                         //checks the file given exists
                getFiles(f);                          //calls getFiles() if given file exists
                printFilesList(files);                //calls printFilesList()
            }
            else {
                System.out.println("\n"+args[0]+" does not exist.\n"); //if file does not exist, tell user
            }
        }
        catch (Exception e) {
            if (args.length == 0) {                   //checks if no argument was given
                System.out.println("\nNo path specified\n");
            }
            else {                                    //if arguments were passed correctly, any other exception will be handles by printing stacktrace
                e.printStackTrace();
            }
        }
    }

    public static void getFiles(File entry) {
        File[] path;                                  //creates an array for the files
        path = entry.listFiles();                     //populates array with files and directories in specified directory
        if (path != null) {                           //checks if the path is null
            for (File p: path) {                      //loops through all files is array
                files.add(p.getName());               //adds file name to files list
                if (p.isDirectory()) {                //checks if file is a directory
                    getFiles(new File(p.getPath()));  //lists directories subdirectories by recursively calling getFiles()

                }
            }
        }
    }
    public static void printFilesList(List<String> list) {
        if (!list.isEmpty()) {                       //checks if list is empty
            for (String f : list) {                  //loops through all items in list
                System.out.println(f);               //prints string in list to screen
            }
        }
    }

}