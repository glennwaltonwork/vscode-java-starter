package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        // Output "Hello World!" to the system console
        System.out.println( "Hello World!" );
    }

    public int sum(int... values) {
        int sum = 0;
        for (int i : values) {
            sum = sum + i;
        }
        return sum;
    }
}
