package com.practice.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrefixSumArrayList {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> resArrList = new ArrayList<>(Arrays.asList(new Integer[A]));
        Collections.fill(resArrList,0);
        for (int i =0; i<B.size();i++){
            resArrList.set((B.get(i).get(0))-1,B.get(i).get(2)+resArrList.get((B.get(i).get(0))-1));
            if ((B.get(i).get(1))<A){
                resArrList.set(B.get(i).get(1),resArrList.get((B.get(i).get(1)))-B.get(i).get(2));
            }
        }
        for (int i=1; i<resArrList.size();i++){
            resArrList.set(i,resArrList.get(i-1)+resArrList.get(i));
        }
        return resArrList;
    }
}
