

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of base");
        double base = in.nextDouble();
        System.out.println("Enter length of side");
        double side = in.nextDouble();
        in.close();
        double perimeter = 2 * (base + side);
        System.out.println(perimeter);
    }
}
