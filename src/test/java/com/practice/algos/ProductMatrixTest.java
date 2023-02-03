package com.practice.algos;

import org.junit.Test;

public class ProductMatrixTest {
    @Test
    public void testAntiDiagonal2D(){
        ProductMatrix productMatrix = new ProductMatrix();
        int inputArrA[][] = {{1,1}};
        int inputArrB[][] = {{2},{3}};

        int productArr[][] = productMatrix.solve(inputArrA,inputArrB);
        System.out.println("resultArray : " );
        for (int i=0;i<productArr.length;i++){
            System.out.println(" ");
            for (int j=0;j<productArr[i].length;j++){
                System.out.print(productArr[i][j]);
                System.out.print(",");
            }
        }
    }
}
