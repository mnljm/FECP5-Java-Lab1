package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");

        float celsius = sc.nextFloat();
        System.out.printf("Temperature in Fahrenheit: %.2f", (celsius*(9.0/5.0)+32.0));



    }
}