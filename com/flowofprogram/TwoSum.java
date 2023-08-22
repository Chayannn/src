package com.flowofprogram;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();
        System.out.println("Sum of two numbers is " + (num1 + num2));
    }
}
