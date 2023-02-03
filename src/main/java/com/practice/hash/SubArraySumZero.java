package com.practice.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumZero {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        long preFixSum=0;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Long,Integer> prefixHash = new HashMap<>();
        int maxLen = -1;
        for (int i=0;i<A.size();i++){
            preFixSum += A.get(i);
            if (prefixHash.containsKey(preFixSum)){
                System.out.println("prefixSum : " + preFixSum + prefixHash);
                System.out.println("prefixHash.get(preFixSum) : "+ prefixHash.get(preFixSum));
                System.out.println("i : " + i);
                int s = prefixHash.get(preFixSum)+1;
                int e = i;
                if (maxLen<(e-s)) {
                    maxLen=e-s;
                    result = new ArrayList<>();
                    for (int j = prefixHash.get(preFixSum) + 1; j <= i; j++) {
                        result.add(A.get(j));
                    }
                }
            }else{
                prefixHash.put(preFixSum,i);
            }
        }
        return result;
    }
}
