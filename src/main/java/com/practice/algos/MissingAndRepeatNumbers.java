package com.practice.algos;

public class MissingAndRepeatNumbers {
    public int[] repeatedNumber(final int[] A) {
        int abs=-1;
        int[] resArr = new int[2];
        for (int i=0;i<A.length;i++){
            abs=Math.abs(A[i]);
            if (A[abs-1] > 0){
                A[abs-1]=-A[abs-1];
            }else
                resArr[0] = abs;
        }
        for (int i=0;i<A.length;i++){
            if (A[i]>0){
                resArr[1]=i+1;
            }
        }
        return resArr;
    }
}
