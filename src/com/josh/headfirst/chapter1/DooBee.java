package com.josh.headfirst.chapter1;

public class DooBee
{
    public static void main(String[] args) throws Exception
    {
        int x = 1;
        while (x < 3)
        {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3)
        {
            System.out.print("Do");
        }
    }
}
