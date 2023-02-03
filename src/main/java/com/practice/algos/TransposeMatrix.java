package com.practice.algos;

public class TransposeMatrix {
    public int[][] solve(int[][] A) {
        int[][] resultArr = new int[A[0].length][A.length];
        for (int row=0;row<resultArr.length;row++){
            for (int col=0;col<resultArr[row].length;col++){
                resultArr[row][col]=A[col][row];
            }
        }
        return resultArr;
    }
}
