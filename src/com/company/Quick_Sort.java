package com.company;

public class Quick_Sort {
    public static void quicksort(int[] a, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(a, si, ei);
        quicksort(a, pivotIndex + 1, ei);
        quicksort(a, si, pivotIndex - 1);
    }

    public static int partition(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }


    public static void main(String[] args) {
        int[] arr = {10,13,42,56,78,96,10,5,23};
        quicksort(arr,0,arr.length-1);
        for (int i=0; i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
