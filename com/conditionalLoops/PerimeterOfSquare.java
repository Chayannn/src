

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of one side");
        double length = in.nextDouble();
        in.close();
        double perimeter = 4 * length;
        System.out.println(Math.round(perimeter));
    }
}
