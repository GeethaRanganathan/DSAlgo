package com.practice.objects;

import java.util.Random;

public class RandomNumbers {
    public void randomGen(){
        Random random = new Random();
        for (int i=0;i<=10;i++){
            System.out.println(random.nextInt(6)+1);
        }
    }
}
