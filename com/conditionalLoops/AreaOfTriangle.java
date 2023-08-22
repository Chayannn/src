

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base ");
        double base = in.nextInt();
        System.out.println("Enter the height");
        double height = in.nextInt();
        in.close();
        double Area = (0.5 * (base * height));
        System.out.println("Area of Triangle is " + Area);
    }
}
