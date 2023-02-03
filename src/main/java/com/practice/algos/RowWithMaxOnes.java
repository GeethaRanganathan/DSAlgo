package com.practice.algos;

public class RowWithMaxOnes {
    public int solve(int[][] A) {
        int i=0;
        int j=A.length-1;
        int count=0;
        int index=-1;
        int maxCount = -99999999;
        while (i<A.length && j>=0){
            System.out.println("i : " + i);
            System.out.println("j : " + j);
            if (A[i][j] == 0){
                count=0;
                i++;
            } else {
                count = A[i].length-1-j+1;
                System.out.println("count : " + count);
                if (maxCount < count){
                    maxCount = count;
                    index=i;
                    System.out.println("index : " + index);
                }
                j--;
            }
        }
        return index;
    }
}
