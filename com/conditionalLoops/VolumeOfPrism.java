

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base area");
        double base = in.nextDouble();
        System.out.println("Enter height");
        double height = in.nextDouble();
        in.close();
        double volume = base * height;
        System.out.println(volume);
    }
}
