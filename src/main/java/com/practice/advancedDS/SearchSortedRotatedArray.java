package com.practice.advancedDS;

import com.practice.design.factory.patterns.A;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSortedRotatedArray {
    public static void main(String[] args) {
       ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5,1,2,3,4));
       int target=1;
       int found = -1;
       int left = 0;
       int right = arr1.size()-1;
       System.out.println(searchBinary(arr1,target,left,right));
    }

    private static int searchBinary(ArrayList<Integer> arr1, int target, int left, int right) {
        if (left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if (arr1.get(mid) == target){
            return mid;
        }
        if (arr1.get(mid)>=arr1.get(left)){
            if(target<arr1.get(mid) && target>=arr1.get(left)){
                return searchBinary(arr1,target,left,mid-1);
            }else{
                return searchBinary(arr1,target,mid+1,right);
            }
        }else if(target>=arr1.get(mid) && target<=arr1.get(right)){
            return searchBinary(arr1,target,mid+1,right);
        }else{
            return searchBinary(arr1,target,left,mid-1);
        }
    }
}
