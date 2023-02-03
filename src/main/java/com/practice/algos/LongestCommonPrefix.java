package com.practice.algos;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        int n = A.size();
        String result = commonPrefix(A,n);

        return result;
    }

    static String commonPrefix(ArrayList<String> A, int n){
        String result ="";
        int index = findMinLen(A);
        int low=0;
        int high = index-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (allContainsPrefix(A,n,A.get(0),low,mid)){
                result = result+A.get(0).substring(low,mid+1);
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
    static int findMinLen(ArrayList<String> A){
        int min = A.get(0).length();
        for (int i=1; i<A.size(); i++){
            min = Math.min(min,A.get(i).length());
        }
        return min;
    }
    static boolean allContainsPrefix(ArrayList<String> A, int n, String str, int start, int end){
        for (int i=0;i<=n-1;i++){
            String str1 = A.get(i);
            for (int j=start;j<=end;j++){
                if (str1.charAt(j) != str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
