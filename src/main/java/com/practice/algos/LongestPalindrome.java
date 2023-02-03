package com.practice.algos;

import java.util.ArrayList;

public class LongestPalindrome {
    public String longestPalindrome(String A) {
        char[] C = A.toCharArray();
        int[] ansArr = new int[2];
        int startVal = -1;
        int length=-1;
        boolean even = false;
        for (int i=0;i<C.length;i++){
            ansArr = expand(C,i,i);
            if (ansArr[1]>length){
                length=ansArr[1];
                startVal = ansArr[0];
            }
            System.out.println("length : " + length);
            ansArr = expand(C,i,i+1);
            if (ansArr[1]>length){
                length=ansArr[1];
                startVal = ansArr[0];
            }
        }
        if (startVal == 0){
            length--;
        }
        System.out.println("length : " + length);
        System.out.println("startval : " + startVal);
        StringBuilder sb = new StringBuilder();
        for (int i=startVal;i<=startVal+length;i++){
            sb.append(C[i]);
        }
        return sb.toString();

    }
    public int[]  expand(char[] C, int i, int j){
        int[] resultArr = new int[2];
        while(i>=0 && j<C.length && C[i]==C[j]){
            i--;
            j++;
        }
        resultArr[0]=i+1;
        resultArr[1]=j-i-1;
        return resultArr;
    }
    public int solve(String A) {
        char[] C = A.toCharArray();
        int i=0;
        int count =0;
        while (i<C.length){
            if (C[i] == 'b' && (i+2)<C.length && C[i+1] == 'o' && C[i+2] == 'b'){
                count++;
                i = i + 3;
            } else{
                i++;
            }
        }
        return count;
    }
    public String stringOperations(String A) {
        char[] C = A.toCharArray();
        int count =0;
        for (int i=0;i<C.length;i++){
            if (C[i]== 'a' || C[i]=='e'||C[i]== 'i' || C[i]=='o'||C[i]=='u'){
                C[i]='#';
            }
            if (!(C[i]>= 'A' && C[i]<='Z')){
                count++;
            }
        }
        char[] newArr = new char[count];
        int j=0;
        for (int i=0;i<C.length;i++){
            if (C[i]>= 'A' && C[i]<='Z'){
                continue;
            }else{
                System.out.println("j : " + j);
                System.out.println("i : " + i);
                newArr[j]=C[i];
                j++;
            }
        }
        String newVal = new String(newArr);
        return newVal+newVal;
    }
    public String longestCommonPrefix(ArrayList<String> A) {
        int size = A.size();
        for (int i=0;i<A.size();i++){
            char C1 = A.get(i).charAt(i);
        }
        char[] C1 = A.get(0).toCharArray();
        char[] C2 = A.get(1).toCharArray();
        char[] C3 = A.get(2).toCharArray();
        boolean prefixSet=false;
        int i=0;
        int minLen = Math.min(C1.length,C2.length);
        minLen = Math.min(minLen,C3.length);

        while (i<minLen && !prefixSet) {
            if (C1[i] == C2[i] && C2[i] == C3[i]) {
                i++;
            }else{
                prefixSet=true;
            }
        }
        String result="";
        for (int j =0;j<i;j++){
            result = result+C1[j];
        }
        return result;
    }
}
