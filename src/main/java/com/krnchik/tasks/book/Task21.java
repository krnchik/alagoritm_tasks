package com.krnchik.tasks.book;

//Удаление начальных и замыкающих пробелов. Написать программу, которая
//удаляет начальные и замыкающие пробелы заданной строки.
public class Task21 {
    public static void main(String[] args) {
        String str = "    Hello word    ";
        System.out.println(str.trim());
    }
}
