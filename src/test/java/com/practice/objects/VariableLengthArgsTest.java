package com.practice.objects;

import org.junit.Test;

public class VariableLengthArgsTest {
    @Test
    public void printSum(){
        VariableLengthArgs variableLengthArgs = new VariableLengthArgs();
        System.out.println("Sum :" + variableLengthArgs.sum(4,6,8,3,2,1));
    }
}
