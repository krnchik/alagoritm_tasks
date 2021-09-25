package com.krnchik.tasks.leetCode.Task2;

import java.util.LinkedList;
import java.util.List;

public class Summa {
    public static void main(String[] args) {
        List<Integer> num1 = List.of(1, 9, 2); //291
        List<Integer> num2 = List.of(4, 9, 5); //594
        System.out.println(sumTwoNum(num1, num2));//885
    }

    private static List<Integer> sumTwoNum(List<Integer> num1, List<Integer> num2) {
        if (num1 == null || num2 == null)
            throw new IllegalArgumentException("Number not found!!!");
        List<Integer> result = new LinkedList<>();
        int size = Math.min(num1.size(), num2.size());
        if (num1.size() == size) {
            result.addAll(num2);
            for (int i = 0; i < size; i++) {
                Integer value = result.get(i);
                result.set(i, value + num1.get(i));
            }
        } else {
            result.addAll(num1);
            for (int i = 0; i < size; i++) {
                Integer value = result.get(i);
                result.set(i, value + num2.get(i));
            }
        }

        return convertToDigit(result);
    }

    private static List<Integer> convertToDigit(List<Integer> num) {

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) >= 10 && i != num.size() - 1) {
                int value = num.get(i);
                int nextValue = num.get(i + 1);
                num.set(i, value - 10);
                num.set(i + 1, nextValue + 1);
            } else if (i == num.size() - 1 && num.get(i) >= 10) {
                int value = num.get(i);
                num.set(i, value - 10);
                num.add(1);
            }
        }
        return num;
    }
}
