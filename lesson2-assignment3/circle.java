package com.company;

public class circle extends shape{
    double radius;                  //creates variable for radius
    public circle(double r) {       //constructor to initialize state of circle object
        this.radius = r;
        display();                  //calls display()
    }

    @Override
    public double calculateArea() {                 //overrides the super class calculateArea() function
        return (this.radius*this.radius)*Math.PI;   //returns area by calculating (r^2)*PI
    }
    @Override
    public void display() {                         //prints area to screen
        System.out.println("Area of circle: "+ calculateArea());
    }
}
