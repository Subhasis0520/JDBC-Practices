package com.company;

public class Last_Index {
    public static int lastIndex(int a[],int x,int si){
        if(si==a.length){
            return -1;
        }
        int k=lastIndex(a,x,si+1);
        if(k!=-1){
            return k;
        }else{
            if(a[si]==x){
                return si;
            }else{
                return -1;
            }
        }
    }
}
