package com.practice.hash;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    public int solve(String A) {
        char[] charArr = A.toCharArray();
        HashMap<Character, Integer> storeChars= new HashMap<>();
        boolean oddBitFound = false;
        for (int i=0;i<charArr.length;i++){
            if (storeChars.containsKey(charArr[i])){
                storeChars.put(charArr[i],storeChars.get(charArr[i])+1);
            }else{
                storeChars.put(charArr[i],1);
            }
        }
        for (Map.Entry<Character, Integer> set:storeChars.entrySet()){
            if (A.length() %2 == 0 && set.getValue()%2 ==0){
                continue;
            }else if (A.length() % 2 ==0){
                return 0;
            }
            if (A.length() %2 != 0 && set.getValue()%2 ==0){
                continue;
            }else if (!oddBitFound){
                oddBitFound = true;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
