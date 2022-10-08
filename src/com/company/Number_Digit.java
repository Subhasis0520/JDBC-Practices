package com.company;

public class Number_Digit {
    public static int count(int n){
        if(n==0){
            return 0;
        }
        int smallOutput = count(n/10);
        int output = smallOutput+1;
  return output;
    }

    public static void main(String[] args) {
        System.out.println(count(2854));
    }
}
