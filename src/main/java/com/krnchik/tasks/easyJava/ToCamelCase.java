package com.krnchik.tasks.easyJava;

import java.util.Locale;

public class ToCamelCase {

    public String toCamelCase(String str) {
        if (str == null || str.isBlank())
            throw new IllegalArgumentException();

        String[] words = str.split("-|_| ]");
        StringBuilder sb = new StringBuilder(words[0]);

        if (words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                sb.append(upperFirstLetter(words[i]));
            }
        }

        return sb.toString();
    }

    private String upperFirstLetter(String word) {
        return word.substring(0, 1)
                .toUpperCase(Locale.ROOT)
                .concat(word.substring(1));
    }
}
