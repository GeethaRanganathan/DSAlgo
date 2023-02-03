package com.practice.algos;

import org.junit.Test;

public class BinaryAdditionTest {
    @Test
    public void testBinaryAddition(){
        BinaryAddition binaryAddition = new BinaryAddition();
        String result = binaryAddition.addBinary("1010110111001101101000", "1000011011000000111100110");
        System.out.println(result);
    }
}
