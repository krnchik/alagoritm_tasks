package com.krnchik.tasks.book;

import java.util.*;

//Сортировка массива строк по длине. Написать программу, которая сортирует
//заданный массив по длине строк.
public class Task15 {
    public static void main(String[] args) {
        String[] arr = {"55555", "1"
        ,"22"
        ,"333"
        ,"666666"
        ,"4444"
        ,"5555510"};
        System.out.println(Arrays.toString(arr));
        String[] sortArr = sortByLength(arr);
        System.out.println(Arrays.toString(sortArr));
        sortByLengthBest(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortByLengthBest(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(String::length));
    }

    private static void sortByLengthBetter(String[] arr) {
        Arrays.sort(arr,
                (String s1, String s2) -> Integer.compare(s1.length(),s2.length()));
    }

    private static String[] sortByLength(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(new ComparatorByLength());
        return list.toArray(new String[0]);
    }

    private static class ComparatorByLength implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return 0;
        }
    }
}
