package com.krnchik.tasks.book;

//Проверка, что строка является палиндромом. Написать программу, которая
//выясняет, является ли данная строка палиндромом или нет.
public class Task11 {
    public static void main(String[] args) {
        String str = "werew";
        String str1 = "1001";
        String str2 = "ghbdtn";

        System.out.println(isPalindromEasy(str));
        System.out.println(isPalindromEasy(str1));
        System.out.println(isPalindromEasy(str2));
    }

    private static boolean isPalindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    private static boolean isPalindromEasy(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
