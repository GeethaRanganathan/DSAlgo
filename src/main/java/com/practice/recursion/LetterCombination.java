package com.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombination {
    private static final List<String> LETTER_MAPPING = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        helper("23", 0, new StringBuilder(), result);
        System.out.println("Final result : " + result);
    }

    private static void helper(String digits, int idx, StringBuilder sb, List<String> result) {
        System.out.println("idx : " + idx);
        System.out.println("sb : " + sb);
        if (idx == digits.length()) {
            if (sb.length() > 0) {
                result.add(new String(sb.toString()));
            }
            return;
        }
        int mappingIdx = Character.getNumericValue(digits.charAt(idx)) - 2;
        for (char c : LETTER_MAPPING.get(mappingIdx).toCharArray()) {
            sb.append(c);
            System.out.println("idx for: " + idx);
            System.out.println("sb for: " + sb);
            helper(digits, idx + 1, sb, result);
            System.out.println("after");
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
