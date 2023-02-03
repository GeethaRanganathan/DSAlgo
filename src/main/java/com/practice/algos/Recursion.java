package com.practice.algos;

public class Recursion {
    static int bar(int x, int y) {
        System.out.println("in bar x & y : " + x +" "+ y);

        if (y == 0) {
            return 0;
        }
        return (x + bar(x, y - 1));
    }
    static int foo(int x, int y) {
        System.out.println("in foo x & y : " + x + " " + y);
        if (y == 0) {
            return 1;
        }
        return bar(x, foo(x, y - 1));
    }
    public static void main(String[] args){
       System.out.println(foo(3,5));
    }
}

