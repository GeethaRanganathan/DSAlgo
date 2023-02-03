package com.practice.algos;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverse(){
        ReverseString reverseString = new ReverseString();
        String result = reverseString.solve("the sky is blue");
        System.out.println("Result String : " + result+".");
    }
}
