package com.practice.algos;

import java.util.ArrayList;

public class PrimeNumber {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        boolean prime=false;
        for (int i=0;i<A.size();i++){
            System.out.println("Current num : " + A.get(i));
            prime=true;
            if (A.get(i)<=0 || A.get(i)==1){
                continue;
            }else if (A.get(i)==2){
                System.out.println("Count incremented for 2");
                count++;
            }else{
                for (int j=2;j<=(int)(Math.sqrt(A.get(i)+1));j++){
                    if (A.get(i)%j==0){
                        System.out.println("divisible by : " + j);
                        prime=false;
                        break;
                    }
                }
                if (prime){
                    System.out.println("Count incremented for prime");
                    count++;
                }
            }
        }
        return count;
    }
}
