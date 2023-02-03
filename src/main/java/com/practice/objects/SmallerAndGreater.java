package com.practice.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerAndGreater {
    public int solve(ArrayList<Integer> A) {
        int counter = 0;
        int min=9999999;
        int max=0;

        for (int i = 0; i<A.size(); i++){
            if (A.get(i)< min){
                min = A.get(i);
            }
            if (A.get(i) > max){
                max=A.get(i);
            }
        }
        for (int i=0; i<A.size(); i++){
            if ((A.get(i) > min) && (A.get(i) < max)){
                counter++;
            }
        }
        return (counter);
    }
}
