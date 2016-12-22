package com.example.javasimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DumbMaths math = new DumbMaths();
        int c = math.add(1, 3);

        System.out.println( "Hello World! " + c );
    }
}
