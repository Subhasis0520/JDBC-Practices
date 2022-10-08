package com.company;

public class Geometric_Sum {
    public static double findGeometricSum(int k){
        if (k==0){
            return 1;
        }
        double smallOutput = findGeometricSum(k-1);
        double output = Math.pow(0.5,k)+smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(findGeometricSum(3));
    }
}
