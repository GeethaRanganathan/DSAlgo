package com.practice.algos;

public class SpiralMatrix {
    public int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int t = 0;
        int b = A-1;
        int l = 0;
        int r = A-1;
        int index = 0;
        int[] squareArr = new int[A * A];
        for (int i = 1; i <= A * A; i++) {
            squareArr[i-1] = i;
        }
        while (true) {
            if (l > r)
                break;
            for (int k = l; k <=r; k++) {
                arr[t][k] = squareArr[index++];
                System.out.println("arr [t][k] : " + arr[t][k]);
            }
            t++;
            if (t > b)
                break;
            for (int k = t; k <=b; k++) {
                arr[k][r] = squareArr[index++];
                System.out.println("arr [k][r] : " + arr[k][r]);
            }
            r--;
            if (l > r)
                break;
            for (int k = r; k >= l; k--) {
                arr[b][k] = squareArr[index++];
                System.out.println("arr [b][k] : " + arr[b][k]);
            }
            b--;
            if (t > b)
                break;
            for (int k = b; k >= t; k--) {
                arr[k][l] = squareArr[index++];
                System.out.println("arr [k][l] : " + arr[k][l]);
            }
            l++;
        }
        return arr;
    }
}
