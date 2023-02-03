package com.practice.hash;

import org.junit.Test;

public class CheckPalindromeTest {
    @Test
    public void testPali(){
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        int result = checkPalindrome.solve("ababeefe");
        System.out.println("result : " + result);
    }
}
