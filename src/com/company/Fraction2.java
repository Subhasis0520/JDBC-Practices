package com.company;

public class Fraction2 {
    private int numerator;
    private int denominator;

    public Fraction2(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        if (numerator == 0) {
            numerator = 1;
        }
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            //Throws execption
            denominator = 1;
        }
        this.denominator = denominator;
        simplify();
    }

    public void simplify() {
        int gcd = 1;
        int samller = Math.min(numerator, denominator);
        for (int i = 2; i <= samller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void add(Fraction2 f2) {
        this.numerator = this.denominator * f2.numerator + this.numerator * f2.denominator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction2 add(Fraction2 fc, Fraction2 f2) {
        int newNum = fc.denominator * f2.numerator + fc.numerator * f2.denominator;
        int newDeno = fc.denominator * f2.denominator;
        Fraction2 f3 = new Fraction2(newNum,newDeno);
        return f3;
    }



    public void Print() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {

        Fraction2 fc = new Fraction2(12, 54);
        System.out.println("The Fraction is: ");
        fc.Print();

        Fraction2 f2 = new Fraction2(8, 12);
//            fc.add(f2);
//        System.out.println("Sum of two fraction is :");
//            fc.Print();

            Fraction2 f3 = Fraction2.add(fc,f2);
            f3.Print();;

    }


}