package com.krnchik.tasks.book;

//Подсчет числа появлений подстроки в строке. Написать программу, которая
//подсчитывает число появлений заданной строки в другой заданной строке.
public class Task17 {
    public static void main(String[] args) {
        String str = "111";
        String subStr = "11";
        System.out.println(countContains(str, subStr));
    }

    private static int countContains(String str, String subStr) {
        int dropSubStr = str.replaceAll(subStr, "").length();
        return (str.length() - dropSubStr) / subStr.length();
    }
}
