package com.company;

public class Sum_Of_Digit {
    public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        int smallOutput = sumOfDigits(input/10);
        int output =(input%10) +smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(456789));
    }
}
