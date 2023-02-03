package com.practice.advancedDS;

import java.util.ArrayList;

public class MissingPositiveNum {
    public int missingNum(ArrayList<Integer> input){
        int n = input.size();
        for (int i=0;i<input.size();i++){
            if (input.get(i) <= 0){
                input.set(i,n+1);
            }
        }
        for (int i=0;i<input.size();i++){
            int val = Math.abs(input.get(i));
            if (val >0 && val <= n){

                int setVal = -1*Math.abs(input.get(val-1));
                input.set(val-1,setVal);
            }
        }
        int missingNum = 0;
        for (int i=0;i<input.size();i++){
            if (input.get(i) >= 0){
                missingNum = i+1;
                break;
            }
        }
        return missingNum>0?missingNum:n+1;
    }
}
