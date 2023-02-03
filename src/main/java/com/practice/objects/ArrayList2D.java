package com.practice.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2D {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> outputList2D = new ArrayList<ArrayList<Integer>>(A);
        for (int i=0;i<A;i++){
            ArrayList<Integer> list = new ArrayList<Integer>(A);
            Collections.fill(list,new Integer(0));
            outputList2D.add(list);
            System.out.println("Array in first for " + outputList2D);
            for (int j=0; j<=i; j++){
                list.add(j+1);
                /*if (j==i){
                    list.add(0);
                }*/
                System.out.println("Array in second for " + outputList2D);
            }
        }
        return outputList2D;
    }
}
