package com.company;

public class Duplicate_In_Array {

        public static int findDuplicate(int[] arr) {
            int val=0;
            for (int i=0;i<arr.length;i++)
            {
                val=val+arr[i];
            }
            return val-((arr.length-2)*(arr.length-1)/2);
        }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(findDuplicate(arr));
    }
}
