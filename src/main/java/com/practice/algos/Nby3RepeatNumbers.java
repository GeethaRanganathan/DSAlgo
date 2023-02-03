package com.practice.algos;

import java.util.List;

public class Nby3RepeatNumbers {
    public int repeatedNumber(final List<Integer> a) {
        //int i=0;
        int majElem1 = -1;
        int freq1 = 0;
        int majElem2 = -1;
        int freq2 = 0;
        for (int i = 0; i < a.size(); i++) {
            if (majElem1 == -1) {
                majElem1 = a.get(i);
            } else if (majElem2 == -1) {
                majElem2 = a.get(i);
            }
            if (majElem1 == a.get(i)) {
                freq1++;
            } else if (majElem2 == a.get(i)) {
                freq2++;
            } else {
                freq1--;
                freq2--;
            }
            if (freq1 == 0) {
                majElem1 = -1;
            }
            if (freq2 == 0) {
                majElem2 = -1;
            }
        }
        System.out.println("M1 : " + majElem1);
        System.out.println("M2 : " + majElem2);
        System.out.println("F1 : " + freq1);
        System.out.println("F2 : " + freq2);
        int count1 = 0;
        int count2 = 0;
        System.out.println("size /3 : " + Math.floor(a.size())/3);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == majElem1) {
                count1++;
                System.out.println("Count 1 : " + count1);
            }
            if (count1 >= Math.floor(a.size() / 3) + 1) {
                return majElem1;
            }
            if (a.get(i) == majElem2) {
                System.out.println("Count 2 : " + count2);
                count2++;
            }
            if (count2 >= Math.floor(a.size() / 3) + 1) {
                return majElem2;
            }
        }
        return -1;
    }
}
