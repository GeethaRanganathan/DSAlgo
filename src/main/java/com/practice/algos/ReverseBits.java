package com.practice.algos;

public class ReverseBits {
    public int revBits(int a){
        int rev=0;
        for (int i=0; i<32; i++){
            rev<<=1;
            if ((a&(1<<i)) != 0){
                rev|=1;
            }
        }
        return rev;
    }
}
