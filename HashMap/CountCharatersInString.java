package HashMap;

import java.util.*;

public class CountCharatersInString {
    public static void main(String[] args) {
        String str = "Java is fun and Java is a powerful";
        int length = str.length();

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < length - 1; i++) {
            count.put(str.charAt(i), count.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(count);

    }
}
