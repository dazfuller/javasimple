package com.example.javasimple;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by dazfuller on 22/12/2016.
 */
public class DumbMathsTest extends TestCase {
    public DumbMathsTest(String name) { super(name); }

    public static Test suite() { return new TestSuite(DumbMathsTest.class); }

    public void testSimpleAdd()
    {
        DumbMaths maths = new DumbMaths();

        int actual = maths.add(3, 4);

        assertEquals(7, actual);
    }

    public void testAddWithNegativeNumbers()
    {
        DumbMaths maths = new DumbMaths();

        int actual = maths.add(4, -3);

        assertEquals(1, actual);
    }

    public void testIntegerOverflow()
    {
        DumbMaths maths = new DumbMaths();

        int actual = maths.add(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals(-2, actual);
    }
}
