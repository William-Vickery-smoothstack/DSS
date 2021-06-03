package com.company;

public class Main {
    public static Object object1 = new Object();        //create 2 objects to 'work' on
    public static Object object2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new thread1();                      //create 2 thread objects
        Thread t2 = new thread2();
        t1.start();                                     //start both threads
        t2.start();
    }
}
/*
thread1 accesses object1 then object2,
thread2 accesses object2 then object1,
since both objects are being accessed,
neither of them can be released to be accessed by the other thread
 */
