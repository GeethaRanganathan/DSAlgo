package com.practice.algos;

public class MaxCharInString {
    public static final int ASCII_VAL = 256;
    public static void main(String[] args) {
        String str = "Mama mia ma";
        int[] asciiArr = new int[ASCII_VAL];
        for (int i=0;i<str.length();i++) {
            asciiArr[str.charAt(i)]++;
        }
        int max=-1;
        char result = ' ';
        for (int i=0;i<str.length();i++){
            if (max<asciiArr[str.charAt(i)]){
                max = asciiArr[str.charAt(i)];
                result=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
