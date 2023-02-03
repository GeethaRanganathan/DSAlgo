package com.practice.algos;

import org.junit.Test;

public class SpiralMatrixTest {
    @Test
    public void testSpiralMatrix(){
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int A=80;
        int[][] resultSpiralMat = spiralMatrix.generateMatrix(A);
        for (int i=0;i<A;i++){
            System.out.println();
            for (int j=0;j<A;j++){
                System.out.print(resultSpiralMat[i][j] + ",");
            }
        }
    }
}
