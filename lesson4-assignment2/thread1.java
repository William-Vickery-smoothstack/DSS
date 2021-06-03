package com.company;

public class thread1 extends Thread{

    public void run() {         //this function will access object1, wait 1 second, then access object2
        try {
            synchronized (Main.object1) {
                System.out.println("working on object1");
                Thread.sleep(1000);
                System.out.println("fetching object2");

                synchronized (Main.object2) {
                    System.out.println("working on object1 and object2");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
