package com.condition;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float originalPrice, discountPercentage, discountAmount, finalprice;
        
        System.out.println("Enter the originalPrice");
        originalPrice = in.nextFloat();

        System.out.println("Enter the discount percentage");
        discountPercentage = in.nextFloat();
        
        discountAmount = (discountPercentage / 100) * originalPrice;
        finalprice = originalPrice - discountAmount;

        System.out.println("Original Price " + originalPrice);
        System.out.println("Discount Amount " + discountAmount);
        System.out.println("Final Price " + finalprice);
        in.close();
    }

}
