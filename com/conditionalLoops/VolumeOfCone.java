

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = in.nextDouble();
        System.out.println("Enter height");
        double height = in.nextDouble();
        in.close();
        double volume = (3.14 * (radius * radius) * (height / 3));
        System.out.println(volume);
    }
}
