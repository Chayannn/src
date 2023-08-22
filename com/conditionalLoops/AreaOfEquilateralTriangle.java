

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of one side");
        double length = in.nextDouble();
        in.close();
        double area = ((1.73205080757 / 4) * (length * length));
        System.out.println(area);
    }

}
