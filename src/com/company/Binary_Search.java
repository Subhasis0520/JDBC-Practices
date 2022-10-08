package com.company;
// This is when the array is in asecnding order
public class Binary_Search {
    public static int search(int[] a, int si, int ei, int x) {
        if (si > ei) {
            return -1;
        }
        int midIndex = (si + ei) / 2;
        if (a[midIndex] == x) {
            return midIndex;
        }
        else if (a[midIndex] < x) {
            return search(a, midIndex + 1, ei, x);
        }
        else {
            return search(a, si, midIndex-1, x);
        }
    }
    public static void main(String[] args) {
     int[] c ={1,2,3,4,5,6,7};
        System.out.println(search(c,0,c.length-1,5));
    }
}
