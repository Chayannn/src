

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = in.nextDouble();
        System.out.println("Enter height");
        double height = in.nextDouble();
        in.close();
        double volume = (((double) 22 /7) * ((radius * radius) * height));
        System.out.println(Math.round(volume));
    }
}
