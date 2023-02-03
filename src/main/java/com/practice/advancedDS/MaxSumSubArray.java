package com.practice.advancedDS;

import java.util.ArrayList;

public class MaxSumSubArray {
    public ArrayList<Integer> maxSum(ArrayList<Integer> input){
        ArrayList<Integer> result = new ArrayList<>();
        int max = input.get(0);
        int sum = input.get(0);
        int stIndex = 0;
        int endIndex = 0;
        for (int i=1;i<input.size();i++){
            if (sum < 0){
                sum = 0;
                stIndex = i;
            }
            sum+= input.get(i);
            if (sum > max){
                max = sum;
                endIndex = i;
            }
        }
        result.add(stIndex);
        result.add(endIndex);
        return result;
    }
}
