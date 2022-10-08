package com.company;

public class SumOfArray_Recursion {
    public static int sum(int input[]) {
        int n = input.length;
        if (n == 1) {
            return input[0];
        }
        int samllOutput[] = new int[input.length - 1];
        for (int i = 0; i < n-1; i++) {
            input[i] = samllOutput[i];
        }
        int output = input[input.length-1]= sum(samllOutput);
        return output;
    }
    public static void main(String[] args) {
     int arr[] = {10,21,32,9,17};
        System.out.println(arr);
    }
}
