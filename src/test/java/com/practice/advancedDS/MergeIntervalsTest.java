package com.practice.advancedDS;

import org.junit.Test;

import java.util.ArrayList;

public class MergeIntervalsTest {
    @Test
    public void testMergeInt(){
        MergeIntervals mergeIntervals = new MergeIntervals();
        ArrayList<MergeIntervals.Interval> intervalList = new ArrayList<>();
        MergeIntervals.Interval intervals = new MergeIntervals.Interval();
        intervals.start=1;
        intervals.end=3;
        intervalList.add(intervals);
        intervals.start=6;
        intervals.end=9;
        intervalList.add(intervals);
        intervals.start=2;
        intervals.end=5;

        ArrayList<MergeIntervals.Interval> resInt= mergeIntervals.insert(intervalList,intervals);
        System.out.println(resInt);
    }
}
