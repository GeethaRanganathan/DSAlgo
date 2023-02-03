package com.practice.algos;

import java.util.ArrayList;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int max = -99999999;
        int min=9999999;
        for (int i=0;i<A.size();i++){
            if (A.get(i) > max){
                max = A.get(i);
            }
            if (A.get(i) < min){
                min=A.get(i);
            }
        }
        int count = 0;
        int minCount=999999;
        int min_Index=-1;
        int max_Index=-1;
        for (int i=0;i<A.size();i++){
            if (A.get(i) == min){
                min_Index=i;
            }
            if (A.get(i) == max){
                max_Index=i;
            }
            if (min_Index !=-1 && max_Index !=-1){
                count = Math.abs(max_Index-min_Index)+1;
                if (count < minCount) {
                    minCount = count;
                }
            }
        }
        return minCount;
    }
}
