package com.practice.algos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayListLeftRotate {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> resultArrayList = new ArrayList<ArrayList<Integer>>();
        int temp=0;
        for (int b=0;b<B.size();b++){
            Integer[] tempArr = A.toArray(new Integer[0]);
            int rotateTimes=B.get(b);
            while (rotateTimes>0){
                temp=tempArr[0];
                for (int i=1; i<tempArr.length;i++){
                    tempArr[i-1]= tempArr[i];
                }
                tempArr[A.size()-1] = temp;
                rotateTimes--;
            }
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(tempArr));
            resultArrayList.add(b,list);
        }
        System.out.println("resultArrayList size : " + resultArrayList.get(0).size());
       return resultArrayList;
    }
}
