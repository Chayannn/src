package com.firstjava;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int max = Math.max(n1, n2);
        System.out.println("Largest number is " + max);
        in.close();
    }

}
