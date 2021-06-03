package com.company;


public class Main {

    public static void main(String[] args) {
        try {
            singleton instance1 = singleton.getInstance();  //create 2 references to a singleton class object
            singleton instance2 = singleton.getInstance();
            System.out.println(instance1.s);                //print the `s` property of instance1 to screen (should be null)
            instance1.s = "hello from instance1";           //sets objects `s` property
            System.out.println(instance2.s);                //print the `s` property of instance2 to screen
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
