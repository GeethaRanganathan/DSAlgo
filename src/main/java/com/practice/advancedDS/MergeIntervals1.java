package com.practice.advancedDS;

import java.util.ArrayList;

public class MergeIntervals1 {

      public static class Interval {
          int start;
          int end;
          Interval() {
              start = 0;
              end = 0;
          }
          public Interval(int s, int e) {
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
          if (intervals == null || intervals.size()==0) return intervals;
          Interval toInsert = newInterval;

          int i=0;
          while (i<intervals.size()){
              Interval currentInterval = intervals.get(i);
              if (currentInterval.end < toInsert.start){
                  i++;
                  continue;
              }else if (toInsert.end < currentInterval.start){
                  intervals.add(i,toInsert);
                  break;
              } else{
                  toInsert.start = Math.min(toInsert.start, currentInterval.start);
                  toInsert.end = Math.max(toInsert.end, currentInterval.end);
                  intervals.remove(i);
              }
          }
          if (intervals.size() == i){
              intervals.add(toInsert);
          }
          return intervals;
        }
    }

