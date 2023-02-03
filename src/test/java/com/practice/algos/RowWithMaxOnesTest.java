package com.practice.algos;

import org.junit.Test;

public class RowWithMaxOnesTest {
    @Test
    public void testMaxOnes(){
        RowWithMaxOnes rowWithMaxOnes = new RowWithMaxOnes();
        //int inputArr[][] = {{0, 0, 1, 1},{0, 0, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1}};
        int inputArr[][] = {
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1}
    };
        int index = rowWithMaxOnes.solve(inputArr);
        System.out.println("first index with max ones : " + index);
    }
}
