package com.company;

public class Shorted1 {
    public static boolean isShorted(int a[]){
        if(a.length==1){
            return true;
        }
        if (a[0]>a[1]){
            return false;
        }
        int smallArray[] = new int[a.length-1];
        for (int i =1; i<a.length;i++){
            a[i]= smallArray[i-1];
        }
        boolean isSmallArrayShorted = isShorted(smallArray);
        return isSmallArrayShorted;

    }
    public static void main(String[] args) {
     int [] arr = {1,2,8,5,6};
        System.out.println(isShorted(arr));;
    }
}
