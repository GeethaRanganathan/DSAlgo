package com.practice.algos;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        int[] arrRes = new int[arrLen];
        int lastElement = 0;
        for (int i=0;i<arrLen;i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int j=0;
        for (int i=0; i<arrLen;i++){
            j=(i+pos)%arrLen;
            arrRes[j] = arr[i];
        }
        for (int i=0;i<arrLen;i++){
            System.out.print(arrRes[i] + " ");
        }

    }
}
