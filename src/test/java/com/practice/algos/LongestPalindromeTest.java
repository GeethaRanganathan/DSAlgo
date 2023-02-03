package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindromeTest {
    @Test
    public void testLongestPalin(){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String result = longestPalindrome.longestPalindrome("abacdfgdcaba");
        System.out.println("Result String : " + result);
    }
    @Test
    public void testbobCount(){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        int count = longestPalindrome.solve("bobabtbobl");
        System.out.println("Count : " + count);
    }
    @Test
    public void testStringOp(){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String result = longestPalindrome.stringOperations("hgUe");
        System.out.println("result : " + result);
    }
    @Test
    public void testLongestPrefix(){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        ArrayList<String> input = new ArrayList<>(Arrays.asList("abab", "ab", "abcd"));
        String result = longestPalindrome.longestCommonPrefix(input);
        System.out.println("result : " + result);
    }
}
