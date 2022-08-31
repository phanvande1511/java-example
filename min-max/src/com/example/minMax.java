package com.example;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A: ");
        Double numberA = sc.nextDouble();

        System.out.print("Enter Number B: ");
        Double numberB = sc.nextDouble();

        System.out.print("Enter Number C: ");
        Double numberC = sc.nextDouble();

        if  (numberA > numberB && numberA > numberB) {
            System.out.println("Number " + numberA + " is the biggest.");
        } else if (numberB > numberA && numberB > numberC) {
            System.out.println("Number " + numberB + " is the biggest.");
        } else {
            System.out.println("Number " + numberC + " is the biggest.");
        }
    }
}
