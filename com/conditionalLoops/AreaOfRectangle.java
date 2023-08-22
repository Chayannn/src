

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height");
        double height = in.nextInt();
        System.out.println("Enter the Width");
        double Width = in.nextInt();
        in.close();
        double Area = height * Width;
        System.out.println("Area of Triangle is " + Area + "cm");
    }
}
