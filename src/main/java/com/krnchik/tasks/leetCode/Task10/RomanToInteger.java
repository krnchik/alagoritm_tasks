package com.krnchik.tasks.leetCode.Task10;

import java.util.*;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        System.out.println(rti.romanToInt("MCMXCIV"));
        System.out.println(rti.romanToIntSimpler("IV"));
    }

    public int romanToInt(String s) {
        if (!isRoman(s))
            throw new IllegalArgumentException();
        int sum = 0;
        String[] number = s.split("");
        Map<String, Integer> numbers = romanStorage();
        for (int i = 0; i < number.length; i++) {
            if (i != number.length - 1) {
                if (isMinus(number[i], number[i + 1])) {
                    sum += numbers.get(number[i + 1]) - numbers.get(number[i]);
                    i++;
                    continue;
                }
            }
            sum += numbers.get(number[i]);
        }
        return sum;
    }

    public int romanToIntSimpler(String s) {
        if (!isRoman(s))
            throw new IllegalArgumentException();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int ans = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i + 1)) <= hm.get(s.charAt(i)))
                ans += hm.get(s.charAt(i));
            else
                ans -= hm.get(s.charAt(i));
        }

        return ans;
    }

    private boolean isMinus(String current, String next) {
        return (current.equals("I") && (next.equals("V") || next.equals("X"))) ||
                (current.equals("X") && (next.equals("L") || next.equals("C"))) ||
                (current.equals("C") && (next.equals("D") || next.equals("M")));
    }

    private Map<String, Integer> romanStorage() {
        Map<String, Integer> storage = new HashMap<>();
        storage.put("I", 1);
        storage.put("V", 5);
        storage.put("X", 10);
        storage.put("L", 50);
        storage.put("C", 100);
        storage.put("D", 500);
        storage.put("M", 1000);
        return storage;
    }

    private boolean isRoman(String s) {
        if (s == null)
            return false;
        if (s.length() > 15 || s.isEmpty())
            return false;
        Set<String> romanDigit = new HashSet<>();
        for (Map.Entry<String, Integer> roman : romanStorage().entrySet()) {
            romanDigit.add(roman.getKey());
        }
        Set<String> digit = new HashSet<>(Arrays.asList(s.split("")));
        int size = romanDigit.size();
        romanDigit.addAll(digit);
        return size == romanDigit.size();
    }
}
