package com.practice.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums  = new int[]{3,2,4};
        int target = 6;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            if (hm.containsKey(target - nums[i]) && (i!=hm.get(target-nums[i]))){
                System.out.println(i + " " + hm.get(target - nums[i]));
                break;
            }
        }
        System.out.println("");;
    }
}
