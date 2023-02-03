package com.practice.algos;

import java.util.ArrayList;

public class SumOfSubArrays {
    public Long subarraySum(ArrayList<Integer> A) {
        Long sum=0L;
        for (int i=0;i<A.size();i++){
            System.out.println("i " + i );
            for (int j=i;j<A.size();j++){
                System.out.println("j " + j);
                    sum=sum + A.get(j);
                    System.out.println("Element : " + A.get(j));
                    System.out.println("Current Sum : " + sum);
                }
            }
        return sum;
    }
}
