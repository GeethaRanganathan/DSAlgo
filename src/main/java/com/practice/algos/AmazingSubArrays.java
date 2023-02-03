package com.practice.algos;

public class AmazingSubArrays {
    public int solve(String A) {
        char[] charArr = A.toCharArray();
    int count = 0;
        for(int i = 0; i<charArr.length;i++){
        if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u' ||
                charArr[i] == 'A' || charArr[i] == 'E' || charArr[i] == 'I' || charArr[i] == 'O' || charArr[i] == 'U') {
            count += charArr.length - i;
            System.out.println("count : " + count);
        }
    }
        return count%10003;
}
}
