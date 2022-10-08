package com.company;

public class Replace_Character {
    public static String replace(String s, char a, char b){
        if (s.length() ==0){
            return s;
        }
        String smallOutput = replace(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b +smallOutput;
        }
        else {
            return s.charAt(0) + smallOutput;
        }
    }


    public static void main(String[] args) {

        System.out.println(replace("Reoax",'o','l'));
    }
}
