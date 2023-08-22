

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base");
        double base = in.nextDouble();
        System.out.println("Enter height");
        double height = in.nextDouble();
        in.close();
        double area = base * height;
        System.out.println(area);
    }

}
