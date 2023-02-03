package com.practice.objects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExec {
        public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
            int index1 = 0;
            int index2 = 0;
            int counter = 0;
            ArrayList<Integer> outputList= new ArrayList<Integer>();
            for (int i=0; i<A.size();i++){
                for (int j=1; j<A.size();j++){
                    if (A.get(i)+A.get(j) == B){
                        System.out.println("j: " + j + "i " + i);
                        index2 = j+1;
                        index1 = i+1;
                        counter++;
                        break;
                    }
                }
            }
            outputList.add(index1);
            outputList.add(index2);
            return (outputList);
        }
    }
