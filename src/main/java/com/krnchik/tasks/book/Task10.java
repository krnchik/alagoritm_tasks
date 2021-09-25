package com.krnchik.tasks.book;

import java.util.*;

//Генерирование всех перестановок. Написать программу, которая генерирует
//все перестановки заданной строки.
public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        String str = "TEST";
        Set<String> set = permuteAndStore("", str);
        Thread.sleep(100);
//        Set<String> set1 = generateAllSwap(str);//неправильный вариант
        System.out.println(set);
//        System.out.println(set1);
        System.out.println(set.size());
        System.out.println(factorial(4));
    }

    private static Set<String> permuteAndStore(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length ();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }

    private static Set<String> generateAllSwap(String str) {
        Set<String> result = new HashSet<>();
        int countGenerates = factorial(str.length());
        while (result.size() != countGenerates) {
            result.add(generateSwap(str));
        }
        return result;
    }

    private static String generateSwap(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.shuffle(list);
        StringBuilder result = new StringBuilder();
        for (Character c : list) {
            result.append(c);
        }
        return String.valueOf(result);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
