package com.practice.algos;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arrLen = sc.nextInt();
            int[] arr = new int[arrLen];
            int lastElement = 0;
            for (int i=0;i<arrLen;i++){
                arr[i] = sc.nextInt();
            }
            int pos = sc.nextInt()%arrLen;
            arr = reverse(arr,0,arrLen-1);
            arr = reverse(arr,0,pos-1);
            arr = reverse(arr,pos,arrLen-1);

            for (int i=0;i<arrLen;i++){
                System.out.print(arr[i] + " ");
            }

        }
        public static int[] reverse(int[] arr, int beg, int end){
            int temp=0;
            int j=end;
            for (int i=beg; i<j ;i++){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
            }
            for (int i =0;i< arr.length;i++){
                System.out.print(arr[i]);
            }
            return arr;
        }
    }