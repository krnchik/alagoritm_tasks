package com.krnchik.tasks.book;

//Проверка, содержит ли строковое значение только цифры. Написать программу,
//которая проверяет, что заданная строка содержит только цифры.
public class Task4 {
    public static void main(String[] args) {
        String str = "1231245678042";
        String str1 = "  22  ";
        String str2 = "ee2r2tty";
        System.out.println(containsOnlyDigits(str));
        System.out.println(containsOnlyDigits(str1.trim()));
        System.out.println(containsOnlyDigits(str2));
    }

    private static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnlyDigitsBest(String str) {
        return str.matches("[0-9]+");
    }
}
