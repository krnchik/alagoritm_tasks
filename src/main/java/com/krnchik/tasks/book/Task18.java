package com.krnchik.tasks.book;

//Проверка, являются ли две строки анаграммами. Написать программу, которая
//проверяет, являются ли две строки анаграммами. Учесть, что анаграммой
//строки является строка, образованная перестановкой букв в обратном порядке
//с игнорированием заглавных букв и пробелов.
public class Task18 {
    public static void main(String[] args) {
        String str = "He  Ll o";
        String anagramStr = "o   l Le  h";
        System.out.println(isAnagram(str, anagramStr));
    }

    private static boolean isAnagram(String str, String anagramStr) {
        StringBuilder sb = new StringBuilder(anagramStr.toLowerCase()
                .replaceAll("\\s", ""));
        sb.reverse();
        return str.toLowerCase()
                .replaceAll("\\s", "")
                .equals(sb.toString());
    }
}
