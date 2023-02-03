package com.practice.algos;

public class RowToColumnZero {
    public int[][] solve(int[][] A) {
        int[][] zeroArr = new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                zeroArr[i][j] = A[i][j];
            }
        }
        for (int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0){
                    int zeroRow=0;
                    int zeroColumn=0;
                    while (zeroRow<A.length){
                        zeroArr[zeroRow][j]=0;
                        zeroRow++;
                    }
                    while (zeroColumn < A[i].length){
                        zeroArr[i][zeroColumn] = 0;
                        zeroColumn++;
                    }
                }
            }
        }
        return zeroArr;
    }
}
