package com.krnchik.tasks.book;


import java.util.LinkedHashMap;
import java.util.Map;

//Отыскание первого неповторяющегося символа. Написать программу, которая
//возвращает первый неповторяющийся (некратный) символ в заданной строке.
public class Task2 {
    public static void main(String[] args) {
        String value = "ffffffffffalt value";
        String str = "ggggggggghhhhhhh";
        System.out.println(firstSymbol(value));
        System.out.println(firstSymbol(str));
    }

    private static String firstSymbol(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            map.compute(s, (k, v) -> v == null ? 1 : ++v);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
