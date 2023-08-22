package com.condition;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Enter a positive integer: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("You entered a negative number");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("factorial of " + n + " is " + factorial);
        }
        in.close();

    }
}
