package com.practice.algos;

import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> sort(ArrayList<Integer> sortArrList, int beg, int end){
        if (beg<end){
            int mid = (beg+end)/2;
            sort(sortArrList,beg,mid);
            sort(sortArrList, mid+1, end);
            merge(sortArrList,beg,mid,end);
        }
        return sortArrList;
    }
    public void merge (ArrayList<Integer> sortArrList,int beg, int mid, int end){
        int n1 = mid-beg+1;
        int n2 = end -mid;
        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i=0;i<n1;i++){
            l[i]=sortArrList.get(beg+i);
        }
        for (int i=0;i<n2;i++){
            r[i]=sortArrList.get(mid+1+i);
        }
        int i=0;
        int j=0;
        int k=beg;
        while (i<n1 && j<n2){
            if (l[i]<=r[j]){
                sortArrList.set(k,l[i]);
                i++;
            }
            else
            {
                sortArrList.set(k,r[j]);
                j++;
            }
            k++;
        }
        while (i<n1){
            sortArrList.set(k,l[i]);
            i++;
            k++;
        }
        while (j<n2){
            sortArrList.set(k,r[j]);
            j++;
            k++;
        }
    }
}