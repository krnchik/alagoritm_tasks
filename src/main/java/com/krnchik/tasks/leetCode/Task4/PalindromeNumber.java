package com.krnchik.tasks.leetCode.Task4;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1241;
        int number1 = 12321;
        int number2 = 9;
        System.out.println(isPalindrome(number2));
    }

    private static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int value = number;
        int result = 0;
        while (value % 10 != 0) {
            int digit = value % 10;
            value = value / 10;

            result = result * 10 + digit;
        }
        return number == result;
    }
}
