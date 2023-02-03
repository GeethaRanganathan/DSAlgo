package com.practice.objects;

import java.util.ArrayList;
import java.util.Collections;

public class MaxofEvenMinOfOdd {

    public int solve(ArrayList<Integer> A) {
        int min = 9999999;
        int max = -9999999;

        for (int i=0; i<A.size();i++){
            if ((A.get(i) % 2 != 0) && A.get(i)<min){
                min = A.get(i);
            }
            if ((A.get(i) % 2 == 0) && A.get(i)>max){
                max = A.get(i);
            }
        }
        System.out.println("min & max : " + min + " " + max);
        return (max-min);
    }
}
