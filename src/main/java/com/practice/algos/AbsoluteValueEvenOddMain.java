package com.practice.algos;

import java.util.Scanner;

public class AbsoluteValueEvenOddMain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int evenCount = 0;
            int oddCount = 0;
            int arraySize = sc.nextInt();

            for (int k=0;k<arraySize;k++){
                if ((sc.nextInt() & 1) == 0){
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println(Math.abs(evenCount-oddCount));
            t--;
            }
        }
}
