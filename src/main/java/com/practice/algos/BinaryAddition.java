package com.practice.algos;

import java.util.ArrayList;

public class BinaryAddition {
    public String addBinary(String A, String B) {
        StringBuilder sumString = new StringBuilder();
        int i=A.length()-1;
        int j=B.length()-1;
        int carry = 0;
        int num1=0;
        int num2=0;
        int addToB = 0;
        int addToA = 0;
        String s=null;

        while((i>=0) || (j>=0)){
            num1 = 0;
            num2 = 0;
            if (i>=0) {
                num1 = A.charAt(i) - '0';
                System.out.println("i : " + i + " " + A.charAt(i));
            }
            if (j>=0) {
                num2 = B.charAt(j) - '0';
                System.out.println("j : " + j + " " + B.charAt(j));
            }
            sumString.append((num1+num2+carry)%2);
            carry = (num1+num2+carry)/2;
            System.out.println(" SumString : " + sumString.toString());
            System.out.println(" carry : " + carry);
            i--;
            j--;
        }
        if (carry > 0){
            sumString.append(carry);
        }
        return(sumString.reverse().toString());
    }
}
