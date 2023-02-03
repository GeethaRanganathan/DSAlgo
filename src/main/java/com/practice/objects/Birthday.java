package com.practice.objects;

public class Birthday {
        int day;
        int month;
        int year;

        public Birthday(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void printBday(){
            System.out.println("Birthday is : " + day + "/" + month + "/" + year);
        }
}
