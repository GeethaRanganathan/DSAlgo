package com.practice.algos;

import java.util.ArrayList;

public class LeastAvgSubArray {
    public int solveBrute(ArrayList<Integer> A, int B) {
        double avg=99999999.99;
        double tempAvg=0.00;
        double sum=0.00;
        int element = 0;
        for (int i=0;i<=(A.size()-B);i++){
            int j=B;
            sum=0;
            System.out.println("j : " + j);
            while (j>0){
                System.out.println("A.get(i+j-1); " + A.get(i+j-1));
                sum+=A.get(i+j-1);
                j--;
            }
            tempAvg=sum/B;
            System.out.println("tempAvg : " + tempAvg);
            System.out.println("i "+ i);
            if (tempAvg<=avg) {
                System.out.println("in swap");
                avg = tempAvg;
                element = i;
            }
            System.out.println("avg : " + avg);
        }
        return element;
    }
    //This method is by prefix Sum
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> psArrayList = new ArrayList<>();
        psArrayList.add(A.get(0));
        for (int i=1; i<A.size(); i++){
            psArrayList.add(psArrayList.get(i-1)+A.get(i));
        }
        System.out.println("psArrayList : " + psArrayList);
        int sum=psArrayList.get(B-1);
        int minSum=sum;
        System.out.println("minSum : " + minSum);
        int index=0;
        for (int i=B;i<A.size();i++){
            int k=Math.abs(B-i);
            sum=psArrayList.get(i)-psArrayList.get(k);
            System.out.println("Sum : " + sum);
            if (sum<minSum){
                minSum=sum;
                System.out.println("B : " + B + " i: " + i);
                index=Math.abs(B-i)+1;
            }
        }
        return index;
    }
}
