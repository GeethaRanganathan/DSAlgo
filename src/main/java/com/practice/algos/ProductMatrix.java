package com.practice.algos;

public class ProductMatrix { // first matrix M*N , second matrix N*P
    public int[][] solve(int[][] A, int[][] B) {
        int [][] productMatrix = new int[A.length][B[0].length];
        for (int i=0;i<A.length;i++){ //no.of row of first matrix (M)
            for (int j=0;j<B[0].length;j++){ //no.of column of second matrix (P)
                for (int k=0;k<B.length;k++){ //0to column of first matrix and row of second matrix so A[0].length should also work (N)
                    productMatrix[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return productMatrix;
    }
}
