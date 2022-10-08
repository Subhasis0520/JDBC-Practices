package com.company;

public class Fraction {

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
 public void simplify(){
        int gcd = 1;
        int samller = Math.min(numerator,denominator);
        for (int i =2; i<=samller; i++){
            if (numerator%i ==0 && denominator%i == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
 }
    private void increment(int num) {
        numerator = numerator + (denominator*num);
        simplify();
    }

    public void Print(){

        System.out.println(numerator+"/" + denominator);
    }

    public static void main(String[] args) {

    Fraction fc = new Fraction(12,54);
    fc.Print();
    fc.increment(2);
    fc.Print();
    Fraction f2 = new Fraction(8,12);
    
    }


}
