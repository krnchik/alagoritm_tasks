package com.krnchik.tasks.book;

import java.util.Set;

//Подсчет гласных и согласных. Написать программу, которая подсчитывает
//число гласных и согласных букв в заданной строке. Сделать это для английского
//языка, который имеет пять гласных (а, е, /, о и и).
public class Task5 {
    public static void main(String[] args) {
        String str = "we are the champions";
        Pair<Integer, Integer> result = countVowelAndConsonants(str);
        System.out.println(result);
    }

    private static Pair<Integer, Integer> countVowelAndConsonants(String str) {
        Set<Character> allVowels = Set.of('a', 'e', 'o', 'i', 'u');
        Integer vowels = 0;
        Integer consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (allVowels.contains(symbol)) {
                vowels++;
            } else if (symbol <= 'z' && symbol >= 'a') {
                consonants++;
            }
        }
        return new Pair<Integer, Integer>(vowels, consonants);
    }


    private static class Pair<V, C> {
        V vowel;
        C consonants;

        public Pair(V vowel, C consonants) {
            this.vowel = vowel;
            this.consonants = consonants;
        }

        @Override
        public String toString() {
            return "vowel = " + vowel +
                    "; consonants = " + consonants;
        }
    }
}
