package com.krnchik.tasks.leetCode.Task29;

import java.util.Set;
import java.util.Stack;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfAString()
                .reverseVowels("leetcode"));
        System.out.println(new ReverseVowelsOfAString()
                .reverseVowelsBetter("leetcode"));
    }

    public String reverseVowels(String s) {
        Set<Character> vowel = Set.of('e', 'E', 'i', 'I', 'o', 'O', 'a', 'A', 'u', 'U');
        Stack<Character> wordVowel = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i)))
                wordVowel.add(s.charAt(i));
        }

        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (vowel.contains(s.charAt(i))) {
                result[i] = wordVowel.pop();
            }
        }

        return new String(result);
    }

    public String reverseVowelsBetter(String s) {
        Set<Character> vowel = Set.of('e', 'E', 'i', 'I', 'o', 'O', 'a', 'A', 'u', 'U');
        char[] result = s.toCharArray();
        int start = 0;
        int end = result.length - 1;
        while (start < end) {
            if (!vowel.contains(result[start])) {
                start++;
                continue;
            }
            if (!vowel.contains(result[end])) {
                end--;
                continue;
            }
            swap(result, start, end);
            start++;
            end--;

        }
        return new String(result);
    }

    private void swap(char[] result, int start, int end) {
        char temp = result[start];
        result[start] = result[end];
        result[end] = temp;
    }
}
