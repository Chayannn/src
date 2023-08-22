package com.condition;

import java.util.Scanner;

public class AverageOfnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers");
        int n = in.nextInt();
        double sum = 0.0;

        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum += num;
        }
        double average = sum / n;
        System.out.println("Average Of numbers is" + average);
        in.close();
    }
}
