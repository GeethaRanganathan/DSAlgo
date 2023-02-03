package com.practice.advancedDS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergeIntervals {

      public static class Interval {
          int start;
          int end;
          Interval() {
              start = 0;
              end = 0;
          }
          Interval(int s, int e) {
              start = s;
              end = e;
          }

          @Override
          public String toString() {
              return "Interval{" +
                      "start=" + start +
                      ", end=" + end +
                      '}';
          }
      }
        public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
          ArrayList<Interval> result = new ArrayList<>();
            Set<Interval> resultSet = new HashSet<>();
          int max=Integer.MIN_VALUE;
          int min = Integer.MAX_VALUE;
            int maxEnd=Integer.MIN_VALUE;
            int minStart = Integer.MAX_VALUE;
          for (Interval i:intervals){
              if ((newInterval.start>=i.start && newInterval.end<=i.end) ||
                      (i.start>=newInterval.start && i.end<= newInterval.end)||
                      (newInterval.start>=i.start && newInterval.start<= i.end) ||
                      (i.start>= newInterval.start && i.start<= newInterval.start)){
                  min = Math.min(i.start,newInterval.start);
                  max = Math.max(i.end, newInterval.end);
                  minStart = Math.min(minStart,min);
                  maxEnd = Math.max(maxEnd,max);
              }else{
                  resultSet.add(i);
              }
          }
          Interval newIn = new Interval();
          newIn.start=minStart;
          newIn.end=maxEnd;
          result.add(newIn);
        return result;
        }
    }

