package com.condition;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double unitPrice = 8;
        System.out.println("Enter the Units of electricity you have consumed ");
        double unit = in.nextDouble();
        double bill = unit * unitPrice;
        System.out.println("Your electricity bill is " + bill+"$");
        in.close();
    }
}
