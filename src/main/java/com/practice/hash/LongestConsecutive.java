package com.practice.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(final List<Integer> A) {
        Set<Integer> elements = new HashSet<>();
        for (int i=0;i<A.size();i++){
            elements.add(A.get(i));
        }
        Iterator value = elements.iterator();
        int i=0;
        int ans=0;
        int x=0;
        int maxL = -1;
        while (value.hasNext() && i<A.size()){
            System.out.println("Value : " + value);
            ans=0;
            if (!value.equals(A.get(i)-1)){
                ans=0;
                x=A.get(i);
                while(elements.contains(x)){
                    System.out.println("x : " + x);
                    ans++;
                    x++;
                }
                System.out.println(ans);
                maxL=Math.max(maxL,ans);
            }
            i++;
        }
        return maxL;
    }
}
