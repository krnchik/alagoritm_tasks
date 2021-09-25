package com.krnchik.tasks.book;

//Удаление пробелов из строки. Написать программу, которая удаляет все пробелы
//из заданной строки.
public class Task8 {
    public static void main(String[] args) {
        String str = "red is a good color for painting. ";
        String result = withoutSpaceBest(str);
        System.out.println(result);
    }

    private static String withoutSpace(String str) {
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder("");
        for (String s : arr) {
            result.append(s);
        }
        return String.valueOf(result);
    }

    private static String withoutSpaceBest(String str) {
        return str.replaceAll("\\s", "");
    }
}
