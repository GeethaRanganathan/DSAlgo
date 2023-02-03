package com.practice.objects;

public class VariableLengthArgs {
    public int sum(int...numbers){
        int sum=0;
        for (int i:numbers){
            sum += i;
        }
        return sum;
    }
}
