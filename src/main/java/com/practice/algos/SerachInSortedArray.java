package com.practice.algos;

public class SerachInSortedArray {
    public int solve(int[][] A, int B) {
        int i=0;
        int j=A[0].length-1;
        int ans=0;
        int minAns=999999999;
        while (i<A.length && j>=0){
            if (A[i][j] == B){
                ans=(i+1)*1009+(j+1);
                if (ans<minAns){
                    minAns=ans;
                }
                j--;
            }else {
                if (A[i][j] < B){
                    i++;
                } else {
                    j--;
                }
            }
        }
        if (minAns==999999999) {
            return -1;
        }else return minAns;
    }
}
