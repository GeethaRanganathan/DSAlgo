package com.practice.algos;

import java.util.ArrayList;

public class TuringPractice1 {
    public int calPoints(String[] ops){
        int result = Integer.MIN_VALUE;
        ArrayList<Integer> resArr = new ArrayList<>();
        int counter = -1;
        for (int i=0;i<ops.length;i++){
            System.out.println(counter + " " + resArr);
            if (ops[i].equals("+")){
                resArr.add(resArr.get(counter) + resArr.get(counter-1));
                counter++;
            }else if (ops[i].equals("D")){
                resArr.add(resArr.get(counter) * 2);
                counter++;
            }else if (ops[i].equals("C")){
                resArr.remove(counter);
                counter--;
            }else{
                resArr.add(Integer.parseInt(ops[i]));
                counter++;
            }
        }
        result=0;
        for (int i=0;i<resArr.size();i++){
            result+=resArr.get(i);
        }
        return result;
    }
}
