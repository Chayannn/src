

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        double height = in.nextInt();
        System.out.println("Enter width");
        double width = in.nextInt();
        in.close();
        double Area = (0.5 * (height * width));
        System.out.println("Area of the Isosceles Triangle is " + Area + "cm");
    }
}
