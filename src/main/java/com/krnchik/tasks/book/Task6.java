package com.krnchik.tasks.book;

//Подсчет появлений некоторого символа. Написать программу, которая подсчитывает
//появления того или иного символа в заданной строке.
public class Task6 {
    public static void main(String[] args) {
        String value = "fate is good. it is faking good.";
        int result = countSymbolAnother(value, 'a');
        System.out.println(result);
    }

    private static int countSymbol(String value, char symbol) {
        return value.length() - value.replace(String.valueOf(symbol), "").length();
    }

    private static int countSymbolAnother(String value, char symbol) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
