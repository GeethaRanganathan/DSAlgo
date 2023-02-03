package com.practice.algos;

import java.util.ArrayList;

public class AntiDiagonal2DArrList {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> resultArr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        int startCol = 0;
        int startRow = 0;
        for (int col = 0; col < A.size(); col++) {
            startCol = col;
            startRow = 0;
            list = new ArrayList<>();
            while (startCol >= 0 && startRow < A.size()) {
                list.add(A.get(startRow).get(startCol));
                startCol--;
                startRow++;
            }
            while (startRow < A.size()) {
                list.add(0);
                startRow++;
            }
            resultArr.add(list);
        }
        for (int row = 1; row < A.size(); row++) {
            startRow = row;
            startCol = A.size() - 1;
            int counter=0;
            list = new ArrayList<>();
            while (startRow < A.size() && startCol >= 0) {
                list.add(A.get(startRow).get(startCol));
                startCol--;
                startRow++;
                counter++;
            }
            while (counter < A.size()) {
                list.add(0);
                counter++;
            }
            resultArr.add(list);

        }
        return resultArr;
    }
}
