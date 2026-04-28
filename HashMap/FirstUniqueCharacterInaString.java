package HashMap;

import java.util.*;

public class FirstUniqueCharacterInaString {
    public static void main(String[] args) {

        String text = "stress";
        System.out.println(firstUnique(text));
    }

    public static Character firstUnique(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length() ; i++) {
            char c = text.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for(int i=0;i<text.length()-1;i++){
            char c =text.charAt(i);
            if(map.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
