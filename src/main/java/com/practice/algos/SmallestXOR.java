package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class SmallestXOR {
        public int solve(int A, int B) {
            int count =A;
            int index = 0;
            int X = 0;
            int setBitsOfA=0;
            int setBits = 0;
            ArrayList<Integer> powList = new ArrayList<Integer>();
            while (count>0){
                if ((count & 1) == 1){
                    setBitsOfA++;
                    powList.add(index);
                }
                index++;
                count = count>>1;
            }
            int remSetBits = B - setBitsOfA;
            int i=powList.size()-1;
            while(setBitsOfA > 0 && B>0){
                X = (X|1<<powList.get(i--));
                setBitsOfA--;
                setBits++;
                if ((setBits >= B) || (setBitsOfA == 0)){
                    setBitsOfA = 0;
                }
            }
            index=0;
            int tempX=0;
            if (remSetBits > 0){
                while(remSetBits > 0){
                    tempX = X;
                    X=(X|(1<<(index)));
                    if (((tempX>>index)&1) !=1){
                        remSetBits--;
                    }
                    index++;
                }
            }
            return X;
        }
    }
