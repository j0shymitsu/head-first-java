package com.josh.headfirst.chapter3;

public class TestArrays
{
    public static void main(String[] args) 
    {
        String [] islands = new String[4];
        int [] index = new int[4];
        int y = 0;

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int ref;

        while(y < 4)
        {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }    
}
