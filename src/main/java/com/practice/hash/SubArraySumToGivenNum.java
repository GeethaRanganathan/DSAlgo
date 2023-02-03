package com.practice.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumToGivenNum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
    ArrayList<Integer> resultArr = new ArrayList<>();
    HashMap<Integer, Integer> sumMap = new HashMap<>();
    int curr_sum=0;
        for (int i=0;i<A.size();i++){
        curr_sum=curr_sum+A.get(i);
        if (curr_sum == B){
            for (int j=0;j<=i;j++){
                resultArr.add(A.get(j));
            }
            return resultArr;
        }
        else if (sumMap.containsKey(curr_sum - B)){
            for (int j=sumMap.get(curr_sum - B)+1;j<=i;j++){
                resultArr.add(A.get(j));
            }
            return resultArr;

        }
        sumMap.put(curr_sum,i);
    }
        resultArr.add(-1);
        return resultArr;
}
}
