package com.flowofprogram;

import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0.0;
        scanner.close();

        System.out.println("Enter numbers to sum (enter 'x' to finish):");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            }

            if (isNumeric(userInput)) {
                double number = Double.parseDouble(userInput);
                totalSum += number;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Sum of all entered numbers: " + totalSum);
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }


}
