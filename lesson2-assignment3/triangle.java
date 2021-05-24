package com.company;

public class triangle extends shape {           //triangle class derives from shape class which has the interface implemented
    double base;                                //creates base variable
    double height;                              //creates height variable
    public triangle(double b, double h) {       //constructor initializes state of triangle object
        this.base = b;
        this.height = h;
        display();                              //calls display()
    }


    public double calculateArea() {             //overrides the super class calculateArea() function
        return (this.base * this.height)/2;     //returns area by calculating (base * height)/2
    }

    @Override
    public void display() {                     //prints area to screen
        System.out.println("Area of triangle: "+ calculateArea());
    }
}
