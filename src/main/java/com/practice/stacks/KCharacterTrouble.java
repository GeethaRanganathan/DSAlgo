package com.practice.stacks;

import java.util.Iterator;
import java.util.Stack;

public class KCharacterTrouble {
    public String solve(String A, int B) {
        Stack<Pair> charSt = new Stack<>();
        Pair pair =new Pair();
        int count = 1;
        if (B!=1){
            for (int i =0; i<A.length();i++){
                pair =new Pair();
                if (charSt.isEmpty()){
                    pair.value=A.charAt(i);
                    pair.count = 1;
                    charSt.push(pair);
                }else
                    if (A.charAt(i) == charSt.peek().value){
                        pair.value=A.charAt(i);
                        pair.count = charSt.peek().count+1;
                        charSt.push(pair);
                        if (charSt.peek().count == B){
                            count=B;
                            while(count>0){
                                charSt.pop();
                                count--;
                            }
                        }
                    }
                else{
                    pair.value=A.charAt(i);
                    pair.count = 1;
                    charSt.push(pair);
                }
            }
        }
        String result = "";
        if (charSt.size()>0){
            Iterator<Pair> i = charSt.iterator();
            while(i.hasNext()){
                result = i.next().value.toString();
            }
        }
        return result;
    }
    public class Pair{
        Character value;
        int count;
    }
}
