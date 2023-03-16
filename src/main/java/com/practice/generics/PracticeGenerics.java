package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class PracticeGenerics {
    public static Boolean[] boolArray = {true,false,true,true};
    public static Integer[] intArray = {2,3,4,5,6,7,8,9};
    public static Character[] stArray = {'A','B'};
    public static void main(String[] args) {
        List<Boolean> boolList = listToArray(boolArray, new ArrayList<>());
        List integerList = listToArray(intArray, new ArrayList<>());
        int number = (int) integerList.get(0);
        List<Character> characterList = listToArray(stArray, new ArrayList<>());
        System.out.println(number);
    }
    public static <T> List<T> listToArray(T[] objects, List<T> objectList){
        for (T o : objects){
            objectList.add(o);
        }
        return objectList;
    }
}
