package com.company;

import java.util.Scanner;

public class Calculate_Power {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int smallOutput = power(x,n-1);
        int output = x*smallOutput;
        return  output;
    }
//    Write a program to find x to the power n (i.e. x^n). Take x and n from the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int x= sc.nextInt();
        System.out.println("Enter the degree");
        int n = sc.nextInt();

        System.out.println(power(x,n));

    }
}
