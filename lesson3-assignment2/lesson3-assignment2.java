import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

 class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 0) {
                appendStringToFileRelative(args[0]);
            }
        }
        catch (Exception e) {
            if (args.length > 0) {
                appendStringToFileAbsolute();
            }
        }
    }
    public static void appendStringToFileRelative(String filename) {
        try {
            String path = (new File("").getAbsolutePath())+"/"+filename;
            System.out.println(path);
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            System.out.print("\nEnter text to append: ");
            Scanner sc = new Scanner(System.in);
            String addition = sc.nextLine();
            writer.write("\n"+addition+"\n");
            writer.close();
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void appendStringToFileAbsolute() {
        String path = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nThere was a problem. Enter full path to file: ");
            path = sc.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
            System.out.print("\nEnter text to append: ");
            String addition = sc.nextLine();
            writer.write(addition);
            writer.close();
            sc.close();
        }
        catch (Exception e) {
            if (path != null) {
                appendStringToFileAbsolute();
            }
        }
    }

}
