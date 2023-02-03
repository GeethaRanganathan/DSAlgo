package com.practice.stacks;

import java.util.Iterator;
import java.util.Stack;

public class Paranthesis {
    public int solve1(String A) {
        Stack<Character> paren = new Stack<>();
        for (int i = 0;i<A.length();i++){
            if (A.charAt(i) == '('){
                paren.push(A.charAt(i));
            }else{
                if (paren.empty()) {
                    return 0;
                }else{
                    paren.pop();
                }
            }
        }
        return paren.empty() ?1:0;
    }
    public int solveMultiple(String A) {
        Stack<Character> paren = new Stack<>();
        for (int i = 0;i<A.length();i++){
            if (A.charAt(i) == '(' || A.charAt(i) == '{' || A.charAt(i) =='['){
                paren.push(A.charAt(i));
            }else if (A.charAt(i) == ')' || A.charAt(i) == '}' || A.charAt(i) ==']'){
                if (paren.empty()) {
                    return 0;
                }else{
                    if (A.charAt(i) == ')' && paren.pop() != '('){
                        return 0;
                    }
                    if (A.charAt(i) == '}' && paren.pop() != '{'){
                        return 0;
                    }
                    if (A.charAt(i) == ']' && paren.pop() != '['){
                        return 0;
                    }

                }
            }
        }
        return paren.empty() ?1:0;
    }
        public String solve(String A, int B) {
            Stack<Character> charSt = new Stack<>();
            int count = 0;
            charSt.push(A.charAt(0));
            System.out.println(charSt.size());
            for (int i =1; i<A.length();i++){
                if (charSt.size()>0 && (A.charAt(i) == charSt.peek())){
                    count++;
                    charSt.push(A.charAt(i));
                    if (count == B-1){
                        int j=B;
                        while(j>0){
                            charSt.pop();
                            j--;
                        }
                        System.out.println(charSt.toString());
                        count = 0;
                    }
                }else{
                    count=0;
                    charSt.push(A.charAt(i));
                }
            }
            String result = "";
            if (!charSt.isEmpty() && count ==0) {
                Iterator<Character> i = charSt.iterator();
                while(i.hasNext()){
                    result = i.next().toString();
                }
            }
            return result;
        }

}
