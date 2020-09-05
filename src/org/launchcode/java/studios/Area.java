package org.launchcode.java.studios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
//        System.out.println("What is the radius:");
//        try{
//            radius = input.nextDouble();
//        } catch (InputMismatchException error) {
//            System.out.println("Please enter a valid radius " + error);
//            return;
//        }

//        if(radius <= 0) {
//            System.out.println("Please enter a valid radius: ");
//        }
        do {
            System.out.println("What is the radius?");
            radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Please enter a valid radius: ");
            } else {
                double areaOfCircle = Circle.getArea(radius);
                System.out.println("The area of the circle is " + areaOfCircle);
            }
        }
            while (radius <= 0) ;

        }
    }
