package com.krnchik.tasks.book;

//Конкатенирование одной и той же строки п раз. Написать программу, которая
//конкатенирует одну и ту же строку заданное число раз.
public class Task20 {
    public static void main(String[] args) {
        String str = "Hello word__";

        System.out.println(concatRepeat(str, 3));
        System.out.println(str.repeat(10));
    }

    private static String concatRepeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
