package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeCharTest {
    @Test
    public void testChangeChar(){
        ChangeChar changeChar = new ChangeChar();
        int count = changeChar.solve("abcabbccd",3);
        System.out.println("Result  : " + count);
    }
}
