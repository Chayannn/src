package com.firstjava;

import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal amount");
        int p_amount = scanner.nextInt();

        System.out.println("Enter time");
        int time = scanner.nextInt();

        System.out.println("Enter rate");
        int rate = scanner.nextInt();

        int simpleInterest = (p_amount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}
