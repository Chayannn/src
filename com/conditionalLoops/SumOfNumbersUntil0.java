import java.util.Scanner;

public class SumOfNumbersUntil0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum(enter '0' to finish): ");

        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            } else {
                sum += input;
            }
        }
        System.out.println("Sum of all entered numbers: " + sum);
        in.close();

    }
}