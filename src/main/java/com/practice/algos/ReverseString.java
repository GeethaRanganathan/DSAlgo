package com.practice.algos;

import java.util.ArrayList;

public class ReverseString {
    public String solve(String A) {
        char[] input = A.toCharArray();
        int s=0;
        int e=A.length()-1;
        reverse(input, s, e);
        int count =0;

        StringBuilder sb = new StringBuilder();
        StringBuilder finalSB = new StringBuilder();
        for (int i=0;i<=input.length;i++){
            if ((i==input.length) ||Character.isSpaceChar(input[i])){
                char[] subArray = sb.toString().toCharArray();
                finalSB.append(reverse(subArray,0,count-1));
                if (finalSB.length()>0 && i<input.length) {
                    finalSB.append(" ");
                }
                sb = new StringBuilder();
                count =0;
            } else{
                count++;
                sb.append(input[i]);
            }
    }
        return finalSB.toString();
}
    public char[] reverse(char[] input, int s, int e){
        while (s<e){
            char temp = input[s];
            input[s]=input[e];
            input[e]=temp;
            s++;
            e--;
        }
        return input;
    }
}
