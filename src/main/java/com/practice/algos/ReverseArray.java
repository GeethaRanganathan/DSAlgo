package com.practice.algos;

import java.util.ArrayList;

public  class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(2);
        A.add(1);
        System.out.println("Array element " + A.get(4));

        for (int i=(A.size()-1);i>=0;i--){
            resList.add(A.get(i));
        }
        System.out.println(resList);
    }
}
