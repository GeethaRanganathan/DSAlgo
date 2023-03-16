package com.practice.algos;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input = 12321;
        int x=0;
        int original = input;
        while (input>0){
            int num = input%10;
            x= x*10 + num;
            input = input/10;
        }
        if (original > 0 && x==original){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
