

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of one side");
        double length = in.nextDouble();
        in.close();
        double perimeter = 3 * length;
        System.out.println("Perimeter of the Triangle is " + perimeter);
    }
}
