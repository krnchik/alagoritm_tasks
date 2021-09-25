package com.krnchik.tasks.book;

//Отыскание наибольшего общего префикса. Написать программу, которая
//отыскивает наибольший общий префикс заданных строк.
public class Task22 {
    public static void main(String[] args) {
        String[] arr = {"asdfgh", "asdfg", "asssf", "asd"};
        System.out.println(maxPrefix(arr));
    }

    private static String maxPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int firstLen = strs[0].length();
        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length()
                        || strs[i].charAt(prefixLen) != ch) {
                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }
}
