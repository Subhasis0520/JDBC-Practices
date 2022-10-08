package com.company;

public class Recursion_Fibonacci {
    public static int fib(int a){
        if(a==1 || a==2){
            return 1;
        }
        int fib1 = fib(a-1);
        int fib2 = fib(a-2);
        int output = fib1+fib2;
        return  output;
    }
    public static void main(String[] args) {

        System.out.println(fib(20));

    }
}
