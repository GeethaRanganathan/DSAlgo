package com.practice.objects;

import java.util.EnumSet;

enum Month{
    JAN, FEB, MAR, APR, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC;
}
public class EnumUsage {
    public void printEnum(){
        Month month = Month.JAN;
        switch (month){
            case JAN:
                System.out.println("Thai pongal");
                break;
            case FEB:
                System.out.println("No festival");
                break;
            case APR:
                System.out.println("Chithirai");
                break;
            default:
                System.out.println("No month");
                break;
        }

    }
    public void enumInForLoop(){
        for(Month month:Month.values()){
            System.out.println(month);
        }
        for (Month month: EnumSet.range(Month.APR, Month.OCT)){
            System.out.println("Range: " + month);
        }
    }
}
