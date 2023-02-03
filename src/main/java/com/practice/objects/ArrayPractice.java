package com.practice.objects;

public class ArrayPractice {
    public void arrayPrac(int i,int arr){
        System.out.println(i +" " +arr);
    }
    public void arrayPrac1(int arr){
        System.out.print(arr+ "\t");
    }
    public static void passAndPrintArray(int x[]){
        for (int y:x){
            System.out.println(y);
        }
    }
}
