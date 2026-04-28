package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersInAString {
    public static void main(String[] args) {
        String input = "Leetcode";
        System.out.println(UniqueCharactersInaString(input));
    }

    private static String UniqueCharactersInaString(String str) {
        int size = str.length();
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            char c = str.charAt(i);
            characters.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char i : characters) {
            result.append(i);
        }

        System.out.println(characters);
        return result.toString();
    }
}
