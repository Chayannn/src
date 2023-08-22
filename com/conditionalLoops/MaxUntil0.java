import java.util.Scanner;

public class MaxUntil0 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter numbers to max(enter '0' to finish): ");

        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            } else {
                max = Math.max(max, input);
            }
        }
        System.out.println("Maximum number is " + max);
        in.close();
    }
}
