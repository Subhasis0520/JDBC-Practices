package com.company;

import java.util.Scanner;

public class Recursion_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int k = sc.nextInt();
        int result = factorial(k);
        System.out.println("Factorial of the first " + k + " number is: " + result);
    }

    public static int factorial(int k) {
        if (k == 0) {
            return 1;
        }
        int samllOutput = factorial(k-1);
        int Output = k*samllOutput;
        return Output;
    }
}