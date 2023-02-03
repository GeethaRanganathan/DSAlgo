package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementCount {
    public int solve(final List<Integer> A) {
        int currNumCount=0;
        int resCount = 0;
        List<Integer> numExists = new ArrayList<Integer>();
        for (int i =0; i<A.size();i++){
            currNumCount=0;
            if (!numExists.contains(A.get(i))){
                numExists.add(A.get(i));
                System.out.println("Entering for element : " + i + A.get(i));
                for (int j=0; j<A.size();j++){
                    System.out.println( " i element is " + A.get(i) +" "+ "element of j : " + A.get(j));
                    if (A.get(i).equals(A.get(j))){
                        currNumCount++;
                        System.out.println("curr count : " + currNumCount);
                    }
                }
                if (currNumCount>=2){
                    resCount += currNumCount-1;
                    System.out.println("resCount : " + resCount);
                }
            }
        }
        System.out.println("numExists : " + numExists);
        return resCount;
    }
}
