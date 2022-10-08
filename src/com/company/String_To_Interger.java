package com.company;

public class String_To_Interger {
         public static int convertStringToInt(String input){

            if (input.length()==0)
            {
                return 0;
            }
            int smallOutput=convertStringToInt(input.substring(0,input.length()-1));
            int val=(int)input.charAt(input.length()-1);
            val=(val-48);
            //System.out.println(val);
            return (val)+(smallOutput*10);

        }


    public static void main(String[] args) {
        System.out.println(convertStringToInt("a"));
    }
}
