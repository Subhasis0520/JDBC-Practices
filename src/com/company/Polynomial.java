package com.company;

import java.util.*;
public class Polynomial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String input2 = s.nextLine();

        String[] p1 = input.split(" ");
        String[] p2 = input2.split(" ");

        int n = p1.length - 2;
        int degree1[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = Integer.valueOf(Integer.parseInt(p1[i + 2].split("x")[0]));
            //System.out.print(degree1[i]);
        }
        int coeff1[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = Integer.valueOf(Integer.parseInt(p1[i + 2].split("x")[1]));
        }
        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }
        // similar to previous
        int n1 = p2.length - 2;
        int degree2[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            degree2[i] = Integer.valueOf(Integer.parseInt(p2[i + 2].split("x")[0]));
        }
        int coeff2[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            coeff2[i] = Integer.valueOf(Integer.parseInt(p2[i + 2].split("x")[1]));
        }
        Polynomial second = new Polynomial();
        for (int i = 0; i < n1; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2:
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3:
                result = first.multiply(second);
                result.print();
                break;
        }
    }

    private int[] poly;
    private int maxDegree;

    public Polynomial() {
        poly = new int[10];
        maxDegree = 0;
    }

    public Polynomial(int degree) {
        poly = new int[degree];
        maxDegree = degree - 1;
    }

    public void setCoefficient(int degree, int coeff) {
        while (degree > poly.length - 1) {
            doubleCapacity();
        }
        if (maxDegree < degree) {
            maxDegree = degree;
        }
        poly[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i = 0; i <= maxDegree; i++) {
            if (poly[i] != 0) {
                System.out.print(poly[i] + "x" + i + " ");
            }
        }
    }

    // Adds two Polynomial and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit;
        if (degree1 > degree2) {
            limit = degree1;
        } else {
            limit = degree2;
        }
        Polynomial polysum = new Polynomial(limit + 1);
        for (int i = 0; i <= limit; i++) {
            int sum = 0;
            if (i <= degree1) {
                sum = sum + (this.poly[i]);
            }
            if (i <= degree2) {
                sum = sum + (p.poly[i]);
            }
            polysum.setCoefficient(i, sum);
        }
        return polysum;
    }

    // Subtracts two Polynomial and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit;
        if (degree1 > degree2) {
            limit = degree1;
        } else {
            limit = degree2;
        }
        Polynomial polydiff = new Polynomial(limit + 1);
        for (int i = 0; i <= limit; i++) {
            int diff = 0;
            if (i <= degree1) {
                diff = diff + (this.poly[i]);
            }
            if (i <= degree2) {
                diff = diff - (p.poly[i]);
            }
            polydiff.setCoefficient(i, diff);
        }
        return polydiff;
    }

    // Multiply two Polynomial and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        int limit = this.maxDegree + p.maxDegree;
        Polynomial polymul = new Polynomial(limit + 1);
        for (int i = 0; i <= this.maxDegree; i++) {
            int product = 0;
            for (int j = 0; j <= p.maxDegree; j++) {
                product = polymul.poly[i + j];
                product = product + (this.poly[i] * p.poly[j]);
                polymul.setCoefficient(i + j, product);
            }
        }
        return polymul;
    }

    private void doubleCapacity() {
        int[] temp = poly;
        poly = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            poly[i] = temp[i];
        }
    }
}
