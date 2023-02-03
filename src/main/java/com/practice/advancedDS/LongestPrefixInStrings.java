package com.practice.advancedDS;

import java.util.Arrays;

public class LongestPrefixInStrings {
    public static void main(String[] args) {
        String[] arr = new String[]{"Zebra","Zebrius","Zebi","Zen"};
        if (arr.length == 0){
            System.out.println("");
        }
        if (arr.length == 1){
            System.out.println(arr[0]);
        }
        Arrays.sort(arr);
        int min = Math.min(arr[arr.length-1].length(),arr[0].length());
        int i=0;
        while(i<min && arr[0].charAt(i) == arr[arr.length-1].charAt(i)){
            i++;
        }
        System.out.println(arr[0].substring(0,i));
    }
}
