package HashMap;

import java.util.HashMap;

public class aaabbc_a3b2c1 {
    public static void main(String[] args) {
        String s = "aaabbcacb"; //make it a3b2c1
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        count.forEach((key,value)-> builder.append(key).append(value));
//        count.forEach((key, value) -> System.out.print(key +""+ count.get(key)));
        System.out.println(builder);

    }
}
