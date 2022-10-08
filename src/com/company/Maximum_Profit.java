package com.company;

import java.util.*;
import java.lang.*;

public class Maximum_Profit {

    public static int maximumProfit(int budget[]) {

        Arrays.sort(budget);
        int ans = Integer.MIN_VALUE;
        int n = budget.length;
        for(int i =0;i<n;i++){
            ans =Math.max(ans,budget[i]*(n-i));
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{20}));
    }
}


