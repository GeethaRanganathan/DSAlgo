package com.practice.algos;

import java.util.ArrayList;

public class PatternPrinting {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> outputList2D = new ArrayList<ArrayList<Integer>>();
        int counter=0;
        for (int i=A; i>0;i--){
        ArrayList<Integer> list = new ArrayList<Integer>();
        outputList2D.add(list);
            counter=A;
            for (int j=1;j<=A;j++){
            if (j>=i) {
                list.add(counter);
            } else{
                list.add(0);
            }
            counter--;
            }
        }
        return(outputList2D);
    }
}
