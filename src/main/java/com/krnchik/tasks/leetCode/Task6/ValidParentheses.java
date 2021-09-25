package com.krnchik.tasks.leetCode.Task6;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[213}, [15], (34)";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {
        String[] ch = str.split("");
        List<String> parenthesesOpen = new ArrayList<>();
        List<String> parenthesesClose = new ArrayList<>();
        List<String> parenthesesAll = new ArrayList<>();
        boolean result = false;
        for (String s : ch) {
            if (s.equals("{") || s.equals("[") || s.equals("(")) {
                parenthesesOpen.add(s);
                parenthesesAll.add(s);
            }
            if (s.equals("}") || s.equals("]") || s.equals(")")) {
                parenthesesClose.add(s);
                parenthesesAll.add(s);
            }
        }
        if (parenthesesOpen.size() == parenthesesClose.size()) {
            for (int i = 0; i < parenthesesClose.size(); i++) {
                if (parenthesesOpen.get(i).equals("{") && parenthesesClose.get(i).equals("}")) {
                    result = true;
                } else if (parenthesesOpen.get(i).equals("(") && parenthesesClose.get(i).equals(")")) {
                    result = true;
                } else if (parenthesesOpen.get(i).equals("[") && parenthesesClose.get(i).equals("]")) {
                    result = true;
                } else {
                    return false;
                }
            }
            String value = parenthesesAll.get(0);
            for (int i = 0; i < parenthesesAll.size(); i++) {
                if (parenthesesAll.get(i).equals("{") && parenthesesAll.get(i + 1).equals("}")) {
                    result = true;
                    break;
                }
                if (parenthesesAll.get(i).equals("[") && parenthesesAll.get(i + 1).equals("]")) {
                    result = true;
                    break;
                }
                if (parenthesesAll.get(i).equals("(") && parenthesesAll.get(i + 1).equals(")")) {
                    result = true;
                    break;
                }
                return false;
            }
        }
        return result;
    }
}
