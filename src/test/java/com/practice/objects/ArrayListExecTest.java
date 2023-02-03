package com.practice.objects;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExecTest {
       /* public static void main(String args[]){
            ArrayListExec arrayListExec = new ArrayListExec();
            int[] inputarr = {4,7,-4,2,2,2,3,-5,-3,9,-4,9,-7,7,-1,9,9,4,1,-4,4,-8};
            ArrayList<Integer> input;
            input = (ArrayList<Integer>) Arrays.asList(inputarr);
            arrayListExec.twoSum(input,3);
        }*/
        //@Test
    public void testSmallGreat(){
            SmallerAndGreater smallerAndGreater = new SmallerAndGreater();
            ArrayList<Integer> input = new ArrayList<>(Arrays.asList( 913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930, 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110));
            int counter = smallerAndGreater.solve(input);
            System.out.println("Count : " + counter);
        }
    @Test
    public void testEvenOdd(){
        MaxofEvenMinOfOdd maxofEvenMinOfOdd = new MaxofEvenMinOfOdd();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-98, 54, -52, 15, 23, -97, 12, -64, 52, 85 ));
        int sum = maxofEvenMinOfOdd.solve(input);
        System.out.println("Max minus Min : " + sum);
    }
    //@Test
    public void test2DArrayList(){
        ArrayList2D arrayList2D = new ArrayList2D();
        ArrayList<ArrayList<Integer>> outputList = arrayList2D.solve(2);
        System.out.println("ArrayList : " + outputList);
    }
}
