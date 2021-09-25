package com.krnchik.tasks.book;

//Инвертирование букв и слов. Написать программу, которая инвертирует буквы
//каждого слова, и программу, которая инвертирует буквы каждого слова и
//сами слова.
public class Task3 {
    public static void main(String[] args) {
        String str = "Dennis is great worker";
        String result = reverseSentence(str);
        System.out.println(result);
        System.out.println(reverseSentenceBetter(str));
    }

    private static String reverse(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return String.valueOf(reverseStr);
    }

    private static String reverseSentenceBetter(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(reverse(words[i]));
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return String.valueOf(result.reverse());
    }

    private static String reverseSentence(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder symbols = new StringBuilder(word);
            symbols.reverse();
            result.append(symbols).append(" ");
        }
        return String.valueOf(result.reverse());
    }
}
