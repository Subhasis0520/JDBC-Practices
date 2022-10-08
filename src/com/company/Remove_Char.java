package com.company;

public class Remove_Char {
    public static String removeX(String s, char x) {
        if (s.length() ==0){
            return s;
        }
        String smallOutput = removeX(s.substring(1),x);
        if(s.charAt(0) == x){
            return smallOutput;
        }
        else
        {
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(removeX("abxcxdx",'x'));
    }
}
