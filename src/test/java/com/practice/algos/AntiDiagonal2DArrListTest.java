package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonal2DArrListTest {
    @Test
    public void testAntiDiagonal2D(){
        AntiDiagonal2DArrList antiDiagonal2DArrList = new AntiDiagonal2DArrList();
        ArrayList<ArrayList<Integer>> input1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> resultArrList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        input1.add(list);
        list=new ArrayList<Integer>(Arrays.asList(4,5,6));
        input1.add(list);
        list=new ArrayList<Integer>(Arrays.asList(7,8,9));
        input1.add(list);

        ArrayList<ArrayList<Integer>> resList = antiDiagonal2DArrList.diagonal(input1);
        System.out.println("resList : " + resList);
    }
    @Test
    public void testLoop(){
        int i = 1;
        while(i < 10){
            int x = i;
            while(x>0){
                System.out.println("X : " + x);
                x--;
            }
            i++;
        }
    }
}
