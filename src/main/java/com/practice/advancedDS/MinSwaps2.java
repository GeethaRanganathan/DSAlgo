package com.practice.advancedDS;

import java.util.ArrayList;

public class MinSwaps2 {
    public int solve(ArrayList<Integer> A) {
        int i=0;
        for (int j=0;j<A.size();j++){
            int temp=0;
            while (A.get(j) != j){
                i++;
                temp=A.get(j);
                A.set(j,A.get(A.get(j)));
                A.set(temp,temp);
            }
        }
        return i;
    }
}
