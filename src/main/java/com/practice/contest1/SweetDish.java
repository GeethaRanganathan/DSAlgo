package com.practice.contest1;

import java.util.ArrayList;
import java.util.Arrays;

public class SweetDish {
    public static void main(String[] args){
        //ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,2,4,5));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,3,7,4));
        int B = 5;
        int C = 8;
        int ans = solve(A,B,C);
        System.out.println("answer : "+ ans);
    }
    public static int solve(ArrayList<Integer> A, int B, int C){
        int ans=0;
        for (int i=0;i<Math.pow(2,A.size());i++){
            int sum =0;
            boolean primeInc = false;
            for (int j=0;j<A.size();j++){
                if ((i&(1<<j))!=0){
                    sum+=A.get(j);
                    if (!primeInc){
                        primeInc = checkPrime(A.get(j));
                    }
                }
            }
           if (sum>=B && sum<=C && primeInc) {
               ans++;
           }
        }
        return ans;
    }
    public static boolean checkPrime(int k){
        if (k==2 || k==3){
            return true;
        }
        for (int i=2;i<=k/2;i++){
            if (k%i == 0){
                return false;
            }
        }
        return true;
    }
}
