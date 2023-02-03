package com.practice.algos;

import java.util.ArrayList;

public class OddEvenEqualRemoveIndex {
    public int solve(ArrayList<Integer> A) {
        int count=0;
        ArrayList<Integer> oddPSArrList = new ArrayList<>();
        ArrayList<Integer> evenPSArrList = new ArrayList<>();
        oddPSArrList.add(0);
        evenPSArrList.add(A.get(0));
        for(int i=1;i<A.size();i++){
            if (i %2 != 0) {
                oddPSArrList.add(oddPSArrList.get(i - 1) + A.get(i));
                evenPSArrList.add(evenPSArrList.get(i-1));
            }else {
                evenPSArrList.add(evenPSArrList.get(i - 1) + A.get(i));
                oddPSArrList.add(oddPSArrList.get(i - 1));
            }
        }
        int lSum=0;
        int rSum=0;
        for (int i=0; i<A.size();i++){
            if (i==0){
                lSum=((evenPSArrList.get(A.size()-1) - evenPSArrList.get(i)));
                rSum=((oddPSArrList.get(A.size()-1) - oddPSArrList.get(i)));
            } else{
                lSum=(oddPSArrList.get(i-1)+(evenPSArrList.get(A.size()-1) - evenPSArrList.get(i)));
                rSum=(evenPSArrList.get(i-1)+(oddPSArrList.get(A.size()-1) - oddPSArrList.get(i)));
            }

            if (lSum==rSum){
                count++;
            }
            }
        return count;
    }
    }
