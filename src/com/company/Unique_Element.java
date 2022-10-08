package com.company;

public class Unique_Element
    {
    public static int findUnique(int[] arr) {
    int val=0;
        for (int i=0;i<arr.length;i++)
    {
        val=val^arr[i];
    }
        return val;
}

        public static void main(String[] args) {
            int [] a ={1,4,2,4,1};
            System.out.println( findUnique(a));
        }
}

