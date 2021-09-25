package com.krnchik.tasks.book;

import java.util.HashMap;
import java.util.Map;

//Отыскание символа с наибольшим числом появлений. Написать программу,
//которая отыскивает символ с наибольшим числом появлений в заданной
//строке.
public class Task14 {
    public static void main(String[] args) {
        String str = "pp ff eee";
        System.out.println(maxCountSymbol(str));
        System.out.println(maxCountSymbolAnother(str));
    }

    private static char maxCountSymbolAnother(String str) {
        char[] symbols = str.toCharArray();
        int[] asciiCode = new int[256];
        int maxOccurrences = -1;
        char maxCharacter = Character.MAX_VALUE;
        for (int i = 0; i < symbols.length; i++) {
            int index = (int) symbols[i];
            asciiCode[index]++;
            if (asciiCode[index] > maxOccurrences) {
                maxOccurrences = asciiCode[index];
                maxCharacter = symbols[i];
            }
        }
        return maxCharacter;
    }

    private static char maxCountSymbol(String str) {
        Map<Character, Integer> countSymbol = countSymbol(str);
        char result = Character.MAX_VALUE;
        int max = 0;
        for (Map.Entry<Character, Integer> c : countSymbol.entrySet()) {
            if (c.getValue() > max) {
                max = c.getValue();
                result = c.getKey();
            }
        }
        return result;
    }

    private static Map<Character, Integer> countSymbol(String str) {
        Map<Character, Integer> result = new HashMap<>();
        char[] symbols = str.toCharArray();
        for (char s : symbols) {
            if (result.get(s) == null) {
                result.put(s, 0);
            } else {
                int count = result.get(s) + 1;
                result.put(s, count);
            }
        }
        return result;
    }
}
