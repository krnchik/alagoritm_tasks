package com.krnchik.tasks.book;

//Проверка наличия подстроки в строке. Написать программу, которая проверяет,
//содержит ли заданная строка заданную подстроку.
public class Task16 {
    public static void main(String[] args) {
        String str = "Hello word!!!";
        String subStr = "wo";
        System.out.println(isAvailability(str, subStr));
        System.out.println(contains(str, subStr));
    }

    private static boolean containsAnother(String str, String subStr) {
        return str.indexOf(subStr) > 0;
    }

    private static boolean contains(String str, String subStr) {
        return str.contains(subStr);
    }

    private static boolean isAvailability(String str, String subStr) {
        return str.length() != str.replaceAll(subStr, "").length();
    }
}
