package com.krnchik.tasks.leetCode.Task3;

public class ReverseInteger {
    public static void main(String[] args) {
        int value = 123456;
        int reverseValue = new ReverseInteger()
                .reverseBetter(value);
        System.out.println(reverseValue);
        reverseValue = new ReverseInteger()
                .reverse(value);
        System.out.println(reverseValue);
    }

    public int reverseBetter(int x) {
        long temp = 0;
        long xLong = x;
        boolean posit = x >= 0;
        if (!posit) {
            xLong *= -1;
        }
        while (xLong > 0) {
            temp = temp * 10 + xLong % 10;
            xLong /= 10;
        }
        long rt = posit ? temp : -1 * temp;
        if (rt > Integer.MAX_VALUE || rt < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rt;
    }

    private int reverse(int x) {
        String number = String.valueOf(x);
        String[] arrayNumber = number.split("");
        String result = "";
        for (int i = arrayNumber.length - 1; i >= 0; i--) {
            result = result.concat(arrayNumber[i]);
        }
        if (result.charAt(result.length() - 1) == '-') {
            result = "-" + result.substring(0, result.length() - 1);
        }
        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
