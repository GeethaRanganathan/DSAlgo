package com.practice.objects;

import java.util.Scanner;

public class CalledObjects {
    private int money;
    public CalledObjects(int initialMoney){
        money = initialMoney;
    }
    public void addMoney(int money){
        this.money += money;

    }
    public int getMoney(){
        return money;
    }
}
