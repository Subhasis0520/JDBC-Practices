package com.company;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n) {
     if (m==0|| n==0){
         return 0;
     }
     int smallOutput = multiplyTwoIntegers(m,n-1);
     return m+smallOutput;
    }


    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(4,5));
    }
}