package com.company;

import java.lang.Math;
abstract class shape implements Ishape  {           //class shape implements the Ishape interface and is abstract to prevent creation of object type shape
    public double calculateArea(double b, double h){      //gets area by returning product of base * height
      return b*h;
    }

    public void display() {                             //prints the area
        System.out.println("Area: "+ calculateArea());
    }
}
