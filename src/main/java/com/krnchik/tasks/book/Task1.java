package com.krnchik.tasks.book;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//Подсчет повторяющихся символов. Написать программу, которая подсчитывает
//повторяющиеся символы в заданной строке.
public class Task1 {
    public static void main(String[] args) {
        String str = "er tat kaban baran kek. Tem + rem.";
        Map<String, Integer> map = countSymbol(str);
        Map<String, Integer> map1 = countSymbolBetter(str);
        Map<Object, Long> map2 = countSymbolBest(str);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);
    }

    private static Map<String, Integer> countSymbol(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

    private static Map<String, Integer> countSymbolBetter(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            map.compute(s, (k, v) -> v == null ? 1 : ++v);
        }
        return map;
    }

    private static Map<Object, Long> countSymbolBest(String str) {

        Map<Object, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return new TreeMap<>(map);
    }
}
