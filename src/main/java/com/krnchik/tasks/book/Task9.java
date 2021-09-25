package com.krnchik.tasks.book;

import java.util.StringJoiner;

//Соединение нескольких строк с помощью разделителя. Написать программу,
//которая соединяет заданные строки с помощью заданного разделителя.
public class Task9 {
    public static void main(String[] args) {
        String str1 = "gang";
        String str2 = "GANG";
        String str3 = "cool";
        String str4 = "COOL";

        String result = compoundStr("кек", str1, str2, str3, str4);
        result = joinByDelimiter("кек", str1, str2, str3, str4);
        System.out.println(result);
    }

    private static String compoundStr(String separator, String... args) {
        String result = "";
        for (int i = 0; i < args.length - 1; i++) {
            result = result.concat(args[i] + separator);
        }
        return result + args[args.length - 1];
    }

    public static String joinByDelimiter(String delimiter, String...args) {
        StringJoiner joiner = new StringJoiner(delimiter);
        for (String arg: args) {
            joiner.add(arg);
        }
        return joiner.toString();
    }
}
