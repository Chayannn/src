

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of one side: ");
        double length = in.nextDouble();
        in.close();
        double Area = 6 * (length * length);
        System.out.println((int) Area + " cm2");
    }
}
