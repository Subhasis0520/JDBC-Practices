package com.company;

public class Equilibrium_Index {
    public static int arrayEquilibriumIndex(int[] arr){
        int totalSum = 0;
        for (int i =0; i<arr.length;i++){
            totalSum += arr[i];
        }
       int leftsum = 0;
        int index =0;
        while (index<arr.length){
            int rightSum = totalSum - leftsum -arr[index];
            if (leftsum == rightSum){
                return index;
            }
            leftsum = leftsum + arr[index];
            index = index+1;
        }

            return -1;
    }

    public static void main(String[] args) {
        int [] a = {1,7,5,2,8,3};
        arrayEquilibriumIndex(a);
    }
}
