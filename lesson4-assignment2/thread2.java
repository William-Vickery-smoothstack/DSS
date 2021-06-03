package com.company;

public class thread2 extends Thread{

    public void run() {         //this function will access object2, wait 1 second, then access object1
        try {
            synchronized (Main.object2) {
                System.out.println("working on object2");
                Thread.sleep(1000);
                System.out.println("fetching object1");

                synchronized (Main.object1) {
                    System.out.println("working on object1 and object2");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}