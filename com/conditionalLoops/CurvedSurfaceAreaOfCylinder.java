

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = in.nextDouble();
        System.out.println("Enter Height");
        double height = in.nextDouble();
        in.close();
        double CSA = 2 * ((double) 22 / 7) * radius * height;
        System.out.println(CSA);
    }
}
