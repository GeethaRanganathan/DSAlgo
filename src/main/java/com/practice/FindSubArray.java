package com.practice;

public class FindSubArray {
    public static void main(String[] args){
        int[] inputArr = {1,2,3,7,5};
        int desiredSum = 12;
        int sum=0;
        int startIndex=0;
        for (int i=0;i<inputArr.length;i++){
            if (sum<desiredSum){
                sum+=inputArr[i];
            }else if(sum>desiredSum) {
                sum-=inputArr[startIndex];
                startIndex++;
            }else{
                System.out.println(startIndex + " " + (i-1));
                break;
            }
        }
    }
}
