package com.company;
import java.util.*;
public class Array_Intersection{

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        //arr1=bubbleSort(arr1);
        //arr2=bubbleSort(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length)
        {
            if (arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }


    }

    public static int[] bubbleSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int []a = {1,3,5,6,7,9};
        int [] b = {2,4,3,7,9,5};
        intersection(a,b);
        //System.out.println(bubbleSort(a));
    }

}
