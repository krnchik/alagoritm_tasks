package com.krnchik.tasks.leetCode.Task8;

import java.util.LinkedList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(removeDuplicates(list));
    }

    private static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new LinkedList<>(list);
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                result.remove(i);
            }
        }
        return result;
    }
}
