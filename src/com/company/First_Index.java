package com.company;

public class First_Index {
    public static int firstIndex(int input[], int x) {

        return firstIndex(input,x,0);
    }

    public static int firstIndex(int input[], int x, int si)
    {
        if (si==input.length-1)
        {
            if (input[si]==x)
            {
                return si;
            }
            else
            {
                return -1;
            }
        }

        if (input[si]==x)
        {
            return si;
        }

        int smallIdx=firstIndex(input,x,si+1);
        return smallIdx;

    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        firstIndex(arr,5);

    }
}
