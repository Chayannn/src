package com.firstjava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter the Operation");
        String operation = scan.next();
        scan.close();
        if (operation.equals("+")) {
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        }
        if (operation.equals("-")) {
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        }
        if (operation.equals("*")) {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        }
        if (operation.equals("/")) {
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        }
    }
}
