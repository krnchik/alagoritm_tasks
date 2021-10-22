package com.krnchik.tasks.leetCode.Task11;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lastWord = new LengthOfLastWord();
        String sentence = "H";
        System.out.println(lastWord.lengthOfLastWord(sentence));
        System.out.println(lastWord.lengthOfLastWordBetter(sentence));
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isBlank()) {
                return words[i].length();
            }
        }
        throw new IllegalArgumentException();
    }

    public int lengthOfLastWordBetter(String s) {
        int last = s.length() - 1;
        int size = 0;

        while (s.charAt(last) == ' ') {
            last--;
        }

        while (s.charAt(last) != ' ') {
            size++;
            if (last == 0)
                break;
            last--;
        }
        return size;
    }
}
