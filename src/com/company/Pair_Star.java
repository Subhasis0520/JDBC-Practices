package com.company;

public class Pair_Star {
    public static String addStars(String s) {
        // Write your code here
        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0) + "*" + smallOutput;
        } else {
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(addStars("hello"));
    }
}
