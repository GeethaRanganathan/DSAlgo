package com.practice.stacks;

import org.junit.Test;

public class ParanthesisTest {
    @Test
    public void testParenthesisBalance(){
        Paranthesis paranthesis = new Paranthesis();
        int result = paranthesis.solve1("(()()()");
        System.out.println("result = " + result);
    }
    @Test
    public void testParenthesisMulBalance(){
        Paranthesis paranthesis = new Paranthesis();
        int result = paranthesis.solveMultiple("({)}");
        System.out.println("result = " + result);
    }
    @Test
    public void testConsecutiveCharremv(){
        KCharacterTrouble kchar = new KCharacterTrouble();
        String result = kchar.solve("abbbabbba",3);
        System.out.println("result = " + result);
    }
}
