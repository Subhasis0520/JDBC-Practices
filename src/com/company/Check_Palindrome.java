package com.company;

public class Check_Palindrome {
    public static boolean isStringPalindrome(String input, int si, int ei)
    {
        if (si>=ei){
            return true;
        }
        boolean smallOutput=true;
        if (input.charAt(si)==input.charAt(ei))
        {
            smallOutput=isStringPalindrome(input,si+1,ei-1);
        }
        else
        {
            smallOutput=false;
        }
        return smallOutput;
    }
    public static void main(String[] args) {
         String s = "racecar";
        System.out.println(isStringPalindrome(s,0,s.length()-1));
    }
}
