package com.practice;


public class TryCode {
    public static void main(String[] args){
        String[] board = new String[9];
        int[] boardInt = new int[9];
        String sb = "";
        StringBuilder sb1 = new StringBuilder();
        for (int i=0;i<9;i++){
            board[i] = String.valueOf(i+1);
            boardInt[i] = Integer.valueOf(board[i]);
            sb+=board[i];
            sb1.append(board[i]);
            System.out.println(board[i]);
            System.out.println(boardInt[i]);
        }
        System.out.println(sb);
        System.out.println(sb1);
    }
}
