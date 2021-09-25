package com.krnchik.tasks.book;

import java.util.regex.Pattern;

//Удаление заданного символа. Написать программу, которая удаляет заданный
//символ из заданной строки.
public class Task13 {
    public static void main(String[] args) {
        String str = "We are the champions!!!";
        System.out.println(removeSymbol(str, 'e'));
        System.out.println(removeSymbolAnother(str, 'e'));
    }

    private static String removeSymbolAnother(String str, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String removeSymbol(String str, char c) {
        return str.replaceAll(Pattern.quote(String.valueOf(c)), "");
    }
}
