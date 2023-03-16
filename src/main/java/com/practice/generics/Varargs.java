package com.practice.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varargs {
    public static void main(String[] args) {
        String item1 = "Apple";
        String item2 = "Banana";
        String item3 = "Cherry";
        String[] shopList = {"Apple" , "Banana", "Cherry"};
        System.out.println("Shopping list 1");
        printShoppingList(shopList);
        System.out.println("Shopping list 2");
        printShoppingList(item1, item2, item3);
        System.out.println("Shopping list 3");
        printShoppingList("Apple" , "Banana", "Cherry", "Donuts");
        System.out.println("Shopping list 4");
        List<String> listOfItems = new ArrayList<String>();
        listOfItems.add("Apple");
        listOfItems.add("Bpple");
        listOfItems.add("Cpple");
        printShoppingList(listOfItems.toArray(new String[listOfItems.size()]));
    }
    public static void printShoppingList(String ... items){
        for (int i=0;i< items.length;i++){
            System.out.println(items[i]);
        }
    }
}
