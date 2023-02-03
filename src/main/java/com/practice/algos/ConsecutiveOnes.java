package com.practice.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConsecutiveOnes {
    public int solve(String A) {
        ArrayList<Integer> inputArrList = new ArrayList<>();
        for (int i=0;i<A.length()-1;i++){
            inputArrList.add(Integer.valueOf(A.substring(i,i+1)));
        }
        inputArrList.add(Integer.valueOf(A.substring(A.length()-1)));
        System.out.println("inputArrlist : " + inputArrList);
        ArrayList<Integer> lSumArrList = new ArrayList<>();
        int longestLen=-1;
        lSumArrList.add(inputArrList.get(0));
        int j=A.length()-1;
        System.out.println("j : " + j);
        ArrayList<Integer> rSumArrList= new ArrayList<>(Arrays.asList(new Integer[A.length()]));
        Collections.fill(rSumArrList,0);
        rSumArrList.set(j,inputArrList.get(A.length()-1));
        for (int i=1;i<inputArrList.size();i++){
            if (inputArrList.get(i)!= 0){
                lSumArrList.add(lSumArrList.get(i-1)+inputArrList.get(i));
            } else
                lSumArrList.add(inputArrList.get(i));
            j--;
            if (inputArrList.get(j)!= 0){
                rSumArrList.set(j,rSumArrList.get(j+1)+inputArrList.get(j));
            } else
                rSumArrList.set(j,inputArrList.get(j));
        }
        int totalOnes=0;
        for (int i=0;i<inputArrList.size();i++){
            totalOnes+=inputArrList.get(i);
        }
        System.out.println("lSumArrList : " + lSumArrList);
        System.out.println("rSumArrList : " + rSumArrList);
        int len=0;
        if (totalOnes==1){
            longestLen=1;
        }
        boolean setlength=false;
        for (int i=1;i<inputArrList.size();i++) {
            if (inputArrList.get(i) == 0 && i!=inputArrList.size()-1) {
                if (lSumArrList.get(i - 1) + rSumArrList.get(i + 1) < totalOnes) {
                    setlength = true;
                    len = lSumArrList.get(i - 1) + rSumArrList.get(i + 1) + 1;
                } else {
                    setlength = true;
                    len = lSumArrList.get(i - 1) + rSumArrList.get(i + 1);
                }
            }
            if (i == (inputArrList.size() - 1) && inputArrList.get(i)==0) {
                len=lSumArrList.get(i-1);
            }

            System.out.println("len : " + len);
            if (setlength==false && totalOnes>0 && i==inputArrList.size()-1){
                len=totalOnes;
            }
            if (len > longestLen) {
                longestLen = len;
            }
        }
        return longestLen;
    }
}
