package com.practice.algos;

import java.util.ArrayList;

public class XOR2DArraylist {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> resultArrList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> xorPS = new ArrayList<Integer>();
        ArrayList<Integer> onesPS = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index=0;
        int xor=0;
        int count=0;
        int ones=0;
        xorPS.add(A.get(0));
        onesPS.add(A.get(0));
        for (int i=1;i<A.size();i++){
            xorPS.add(xorPS.get(i-1)^A.get(i));
            onesPS.add(onesPS.get(i-1)+A.get(i));
        }
        while (index<B.size()){
            list=new ArrayList<>();
            xor=0;
            int l=B.get(index).get(0)-1;//-1 because the range given does not start from 0 unlike index.
            int r=B.get(index).get(1)-1;
            if (l==0) {
                ones = onesPS.get(r);
            }else{
                ones=onesPS.get(r)-onesPS.get(l-1);
            }
            if ( (ones & 1) == 1){
                xor=1;
            }
            list.add(xor);
            list.add(r-l+1-ones); //This will subtract the no of ones in the range
            resultArrList.add(list);
            index++;
            }
        return resultArrList;
    }
}
