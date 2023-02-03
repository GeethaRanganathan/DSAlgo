package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeMatrixTest {
    @Test
    public void testAntiDiagonal2D(){
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int inputArr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        /*int inputArr[][] = {
                {21, 62, 16, 44, 55, 100, 16, 86, 29},
                {62, 72, 85, 35, 14, 1, 89, 15, 73},
                {42, 44, 30, 56, 25, 52, 61, 23, 54},
                {5, 35, 12, 35, 55, 74, 50, 50, 80},
                {2, 65, 65, 82, 26, 36, 66, 60, 1},
                {18, 1, 16, 91, 42, 11, 72, 97, 35},
                {23, 57, 9, 28, 13, 44, 40, 47, 98},
    };*/
        inputArr = transposeMatrix.solve(inputArr);
        System.out.println("resultArray : " );
        for (int i=0;i<inputArr.length;i++){
            System.out.println();
            for (int j=0;j<inputArr[i].length;j++){
                System.out.print(inputArr[i][j]);
            }
        }
    }
}
