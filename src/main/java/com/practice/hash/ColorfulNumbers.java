package com.practice.hash;

import com.practice.algos.ChangeChar;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumbers {
    public int colorful(int A) {
        Set<Integer> setForProduct = new HashSet<>();
        String s= String.valueOf(A);
        for (int i=0;i<s.length();i++){
            int prod = 1;
            for (int j=i;j<s.length();j++){
                prod *= Character.getNumericValue(s.charAt(j));
                if (setForProduct.contains(prod)){
                    return 0;
                }else{
                    setForProduct.add(prod);
                }
            }
        }
        return 1;
    }
}
