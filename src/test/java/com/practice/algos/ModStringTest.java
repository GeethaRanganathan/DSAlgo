package com.practice.algos;

import org.junit.Test;

public class ModStringTest {
    @Test
    public void testModString(){
        ModString modString = new ModString();
        int rem = modString.findMod("49",7);
        System.out.println("Rem : " + rem);
    }
}
