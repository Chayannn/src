package com.flowofprogram;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        int num1, num2, temp, temp1, temp2, hcf, lcm;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = in.nextInt();
        System.out.println("Enter second number");
        num2 = in.nextInt();
        in.close();
        temp1 = num1;
        temp2 = num2;
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;

        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
    }
}
