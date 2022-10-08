package com.company;

class Test1
{
    int a;
    int b;
    Test1()
    {
        this(10, 20);
        System.out.print("constructor one ");
    }
    Test1(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.print("constructor two ");
    }
}
public class Constructor2 {
    public static void main(String[] args)
    {
        Test1 object = new Test1();
    }
}