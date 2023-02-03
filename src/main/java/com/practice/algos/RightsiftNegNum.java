package com.practice.algos;

public class RightsiftNegNum {
    public int shiftNegativeNum(int A){
        int x = -126;
        System.out.println(x>>1);
        x=-1;
        System.out.println(x>>1);
        int y = 1;
        System.out.println(y>>1);
        while (A!= -1){
            A=A>>1;
            System.out.println("value of A after shift " + A);
        }
        return A;
    }
}
