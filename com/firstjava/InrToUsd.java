package com.firstjava;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount in indian rupee ");
        int amount = in.nextInt();
        in.close();
        System.out.println(Math.round(amount / 83.08) + "$");
    }
}
