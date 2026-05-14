package HashMap;

import java.util.*;

public class Count_Frequency_of_words_in_Sentence {
    public static void main(String[] args) {

        String text = "Java is fun and Java is a powerful";
//        String[] s = text.split(" ");
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : text.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
//        System.out.println(count);
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            System.out.println(e);
        }
    }
}
