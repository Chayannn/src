

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
        scanner.close();

        int result = subtractProductAndSum(integerInput);
        System.out.println("Result: " + result);
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sumOfDigits = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sumOfDigits += digit;
            n /= 10;
        }

        int difference = product - sumOfDigits;

        return difference;
    }
}
