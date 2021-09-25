package com.krnchik.tasks.leetCode.Task3;

public class ReverseInteger {
    public static void main(String[] args) {
        int value = 123456;
        int reverseValue = reverseInt(value);
        System.out.println(reverseValue);
    }

    private static int reverseInt(int value) {
        int number = value;
        int result = 0;
        while (number % 10 != 0) {
            int digit = number % 10;
            number = number / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
    private static int reverseInteger(int value) {
        String number = String.valueOf(value);
        String[] arrayNumber = number.split("");
        String result = "";
        for (int i = arrayNumber.length - 1; i >= 0; i--) {
            result = result.concat(arrayNumber[i]);
        }
        return Integer.parseInt(result);
    }
}
