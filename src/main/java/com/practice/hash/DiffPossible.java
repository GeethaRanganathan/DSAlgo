package com.practice.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffPossible {
    public int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        if (A.size() <=1){
            return 0;
        }
        for (int i=0;i<A.size();i++){
            if (sumMap.containsKey(A.get(i))){
                sumMap.put(A.get(i),sumMap.get(A.get(i))+1);
            }else {
                sumMap.put(A.get(i), 1);
            }
        }
        for (int i=0; i<A.size();i++) {
            boolean matchFound = false;
            if (sumMap.containsKey(A.get(i) - B)) {
                matchFound = true;
                if (B == 0) {
                    if (sumMap.get(A.get(i)) > 1) {
                        matchFound = true;
                    } else {
                        matchFound = false;
                    }
                }
                if (matchFound) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
