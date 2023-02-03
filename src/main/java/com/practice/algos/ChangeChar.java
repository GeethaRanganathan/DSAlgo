package com.practice.algos;

import java.util.Arrays;

public class ChangeChar {
    public int solve(String A, int B) {
        char[] charArr = A.toCharArray();
        int[] C = new int[26];
        int count =0;
        for (int i=0;i<charArr.length;i++){
            int index = charArr[i]-'a';
            C[index]++;
        }
        Arrays.sort(C);
        for (int i=0; i<=26;i++){
            if (B-C[i]>=0 && C[i]!=0){
                B-=C[i];
            }
        }
        /*int j=0;
        int m=1;
        while(B>0 && m<=B){
            j=0;
            while (j<C.length){
                for (int k=m;k>0;k--){
                    if (C[j]==k && B>0){
                        B--;
                        C[j]--;
                    }
                }
                j++;
            }
            m++;
        }*/
        for (int i=0;i<C.length;i++){
            if (C[i]>0){
                count++;
            }
        }
        //return count-B>0 ? count-B : count;
        return count;
    }
}
