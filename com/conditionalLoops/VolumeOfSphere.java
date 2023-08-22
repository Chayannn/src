
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = in.nextDouble();
        in.close();
        
        double volume = (((double) 4 / 3) * ((double) 22 / 7) * (radius * radius * radius));
        System.out.println(Math.round(volume));
    }
}
