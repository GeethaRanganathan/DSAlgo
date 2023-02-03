package com.practice.hash;

import org.junit.Test;

public class ColorfulNumbersTest {
    @Test
    public void testColor(){
        ColorfulNumbers colorfulNumbers = new ColorfulNumbers();
        int result = colorfulNumbers.colorful(236);
        System.out.println("result : " + result);
    }
}
