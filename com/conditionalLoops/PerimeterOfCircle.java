
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = in.nextDouble();
        in.close();
        double perimeter = (2 * 3.14) * radius;
        System.out.println(Math.round(perimeter));
    }
}
