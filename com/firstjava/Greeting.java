package com.firstjava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        name.close();
        System.out.print("Hello, " + Name);
    }
}
