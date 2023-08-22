package com.chayan;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = in.nextFloat();
        in.close();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.println(tempF + "F");
    }
}
