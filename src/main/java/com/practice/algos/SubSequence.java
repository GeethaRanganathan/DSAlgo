package com.practice.algos;

public class SubSequence {
    public String solve(String A) {
        int[] alpArr = new int[26];
        for (int k=0;k<A.length();k++){
            alpArr[A.charAt(k)-'a']++;
        }
        StringBuilder newString = new StringBuilder();
        newString.append((char)97);
        System.out.println(newString.toString());

        /*int i=0;
        boolean stringFound= false;
        while (i<A.length() && stringFound){

        }*/
        return A;
    }
}
