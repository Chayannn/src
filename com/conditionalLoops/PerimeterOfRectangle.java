

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        double length = in.nextDouble();
        System.out.println("Enter width");
        double width = in.nextDouble();
        in.close();
        double perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}
