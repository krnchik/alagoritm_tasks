package com.krnchik.tasks.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Удаление повторяющихся символов. Написать программу, которая удаляет
//повторяющиеся символы из заданной строки.
public class Task12 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(dropRepeatSymbol(str));
        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicatesBetter(str));
    }

    private static String dropRepeatSymbol(String str) {
        String[] symbols = str.split("");
        Set<String> uniqueSymbols = new HashSet<>();
        String result = str;

        for (String s : symbols) {
            if (!uniqueSymbols.add(s)) {
                result = result.replaceAll(s, "");
            }
        }
        return result;
    }

    public static String removeDuplicatesBetter(String str) {
        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }

    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); // или использовать charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
