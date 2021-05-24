package com.company;

public class rectangle extends shape{       //rectangle class derives from shape class which has the interface implemented
    double base;                            //creates base variable
    double height;                          //creates height variable
    public rectangle(double b, double h) {  //constructor initializes state of rectangle object
        this.base = b;
        this.height = h;
        display();                          //calls display()
    }

    @Override
    public double calculateArea() {         //overrides the super class calculateArea() function
        return this.base * this.height;     //returns base * height
    }
    @Override
    public void display() {                 //prints area to screen
        System.out.println("Area of rectangle: "+ calculateArea());
    }

}
