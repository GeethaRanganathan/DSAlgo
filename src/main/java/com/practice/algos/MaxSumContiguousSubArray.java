package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguousSubArray {
    public int maxSubArray(final List<Integer> A) {
        int maxsofar=0;
        int maxuptohere=0;
        int negMaxUptohere=-999999999;
        for (int i=0;i<A.size();i++){
            maxuptohere+=A.get(i);
            System.out.println("maxuptohere: " + maxuptohere);
            if (maxuptohere < 0){
                if (negMaxUptohere<maxuptohere) {
                    negMaxUptohere = maxuptohere;
                }
                maxuptohere=0;
            }
            System.out.println("negMaxUptohere : " + negMaxUptohere);
            if (maxsofar<maxuptohere){
                maxsofar=maxuptohere;
            }
        }
        if (maxsofar !=0){
            return maxsofar;
        }else{
            return negMaxUptohere;
        }
    }
}
