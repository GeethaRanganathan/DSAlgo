package com.practice.algos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FormLargestNumber {
    public String largestNumber(final List<Integer> A) {
        String[] arr = new String[A.size()];
        for(int i=0; i<A.size(); i++){
            arr[i]=String.valueOf(A.get(i));
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                System.out.println("b+a : " + b+a);
                System.out.println("a+b : " + a+b);
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
