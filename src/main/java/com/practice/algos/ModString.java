package com.practice.algos;

public class ModString {
    public int findMod(String A, int B) {
        int rem=0;
        int carry=1;
        for (int i=A.length()-1;i>=0;i--){
            rem=rem + ((A.charAt(i)-'0')%B*carry)%B;
            carry=(carry*10)%B;
            rem=rem%B;
        }
    return rem;
    }
    }
