package com.practice.objects;

import org.junit.Test;

public class ArrayPracticeTest {
    @Test
    public void testArrays(){
        ArrayPractice arrayPractice = new ArrayPractice();
        int arr1[] = new int[6];
        int arr2[] = {1,2,3};
        int arr3[][] = {{1,2,3},{4,5,6}};

        arr1[0] = 8;
        arr1[1] = 9;
        arr1[2] = 18;
        arr1[3] = 19;
        arr1[4] = 81;
        arr1[5] = 91;
        for (int i =0 ; i<6; i++){
            arrayPractice.arrayPrac(i,arr1[i]);
        }

        for(int x:arr2) {
            arrayPractice.arrayPrac1(x);
        }
        arrayPractice.passAndPrintArray(arr2);
        for (int row=0;row<arr3.length;row++){
            for (int col=0; col<arr3[row].length; col++){
                arrayPractice.arrayPrac1(arr3[row][col]);
            }
            System.out.println();
        }

    }
}
