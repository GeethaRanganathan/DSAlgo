package com.practice.Recursion;

public class PowerFunction {
    public int pow(int A, int B, int C) {
        if (A==0){
            return 0;
        }
        if (B==0){
            return 1;
        }
        if (A<0 && B==1){
            return (A+C)%C;
        }
        int halfPow = power(A,B/2,C);
        int halfAns =(int) ((long)halfPow %C *(long)halfPow %C)%C;
        if (B%2 == 0){
            return halfAns%C;
        } else{
            return (halfAns*A) %C;
        }
    }
    static int power(int A, int B, int C){
        if (B==0){
            return 1;
        }
        return A*power(A,B-1,C);
    }
    public int power(int a, int n) {
        if (n==0){
            return 1;
        }
        int halfPow = power(a,n/2);
        int halfAns =(int) ((long)halfPow *(long)halfPow);
        if (n%2 == 0){
            return halfAns;
        } else{
            return (halfAns*a);
        }
    }
}
