package org.launchcode.java.excercises;

import java.util.Scanner;

public class MileageAdventure {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles were driven: ");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas consumed: ");
        int gas = input.nextInt();
        System.out.println("The miles-per-gallon is: " + miles/gas);
    }
}
