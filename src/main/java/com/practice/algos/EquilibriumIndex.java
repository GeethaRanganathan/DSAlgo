package com.practice.algos;

import java.util.ArrayList;

public class EquilibriumIndex {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> preFixSumArrList=new ArrayList<>();
        int index=-1;
        preFixSumArrList.add(A.get(0));
        for (int i=1;i<A.size();i++){
            preFixSumArrList.add(A.get(i)+preFixSumArrList.get(i-1));
        }
        for (int i=1;i< preFixSumArrList.size()-1;i++){
            if (preFixSumArrList.get(i-1)==(preFixSumArrList.get(A.size()-1)- preFixSumArrList.get(i))){
                index=i;
            }
        }
        return index;
    }
}
