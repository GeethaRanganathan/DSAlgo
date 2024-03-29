package com.practice.algos;

import java.util.ArrayList;

public class TwoGreatestElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int firstGreatest = -9999999;
        int secondGreatest = -9999999;
        ArrayList<Integer> outputList = new ArrayList<>();
        for (int i=0; i<A.size(); i++){
            if (A.get(i) > firstGreatest){
                secondGreatest=firstGreatest;
                firstGreatest = A.get(i);
            }else if (secondGreatest<A.get(i)){
                secondGreatest=A.get(i);
            }
        }
        for (int i = 0; i<A.size();i++){
            if (!(A.get(i).equals(secondGreatest) || A.get(i).equals(firstGreatest))){
                outputList.add(A.get(i));
            }
        }
        return (outputList);
    }
}
