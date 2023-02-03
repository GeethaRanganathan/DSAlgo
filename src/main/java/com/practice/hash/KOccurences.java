package com.practice.hash;

import java.util.*;

public class KOccurences {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer,Integer> heightMap = new HashMap<>();
    int sum=0;
        for (int i=0;i<C.size();i++){
        if (heightMap.containsKey(C.get(i))){
            heightMap.put(C.get(i),heightMap.get(C.get(i))+1);
        } else{
            heightMap.put(C.get(i),1);
        }
    }
        for(Map.Entry<Integer,Integer> set: heightMap.entrySet()){
            System.out.println(heightMap);
        if (set.getValue() == B){
            sum += set.getKey();
        }
    }
    return sum!=0 ?sum : -1;
}

}
