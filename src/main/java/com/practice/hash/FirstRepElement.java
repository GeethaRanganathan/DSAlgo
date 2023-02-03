package com.practice.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepElement {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> storeFreq = new HashMap<>();
        int repElement=-1;
        for (int i=0;i<A.size();i++){
            if (storeFreq.containsKey(A.get(i))){
                storeFreq.put(A.get(i),storeFreq.get(A.get(i))+1);
            }else{
                storeFreq.put(A.get(i),1);
            }
        }
        for (int i=0;i<A.size();i++){
            if (storeFreq.get(A.get(i)) > 1){
                repElement = A.get(i);
                break;
            }
        }

        return repElement;
    }
}
