package com.krnchik.tasks.book;

//Конвертирование строки в значение типа int, long, float или double. Написать
//программу, которая конвертирует заданный объект типа string (представляющий
//число) в значение типа int, long, float или double.
public class Task7 {
    public static void main(String[] args) {
        String ints = "12";
        String longs = "1234589";
        String doubles = "234.221";
        System.out.println(toInt(ints));
        System.out.println(toLong(longs));
        System.out.println(toDouble(doubles));
    }

    private static double toLong(String longs) {
        return Long.parseLong(longs);
    }

    private static double toDouble(String doubles) {
        return Double.parseDouble(doubles);
    }

    private static int toInt(String ints) {
        return Integer.parseInt(ints);
    }
}
