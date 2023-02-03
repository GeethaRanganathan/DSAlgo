package com.practice.algos;

import java.util.ArrayList;
import java.util.Arrays;

public class SpclSubSequence {
    public int solve(String A) {
        //Commented first approach which also works.
        /*int count = 0;
        int res=0;
        for(int i=0;i<A.length();i++){//GUGPUAGAFQBMPYAG
            if (String.valueOf(A.charAt(i)).equals("A")){
                count+=1;3
            }
            if (String.valueOf(A.charAt(i)).equals("G")){
                res=res+count;4
            }
        }
        return res%1000000007;*/
        //Below is method from scaler- Approach -2:
        int n = A.length(), ans = 0, MOD = 1000*1000*1000 + 7;
        int cnt_G[] = new int[n], count = 0;
        //Suffix count of G
        for(int i = n-1 ; i >= 0 ; i--){
            if(A.charAt(i) == 'G') {
                count = count + 1;
            }
            cnt_G[i] = count;
            System.out.println("cnt_G[i] : " + i+ " " + cnt_G[i]);
        }
        // traverse the string again from beginning
        for(int i = 0; i < n; i++){
            // if current character is "A" then add number of G's after that
            if(A.charAt(i) == 'A') {
                ans = ans + cnt_G[i];
                ans = ans % MOD;
            }
        }
        return ans;
    }
}
