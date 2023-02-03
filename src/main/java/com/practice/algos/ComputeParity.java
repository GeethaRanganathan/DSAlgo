package com.practice.algos;

public class ComputeParity {
    public short parity(int x){
        short result=0;
        while (x!=0){
            System.out.println("x : " + x);
            result ^= 1;
            System.out.println(" result : " + result);
            x&=x-1;
        }
        return result;
    }
}
