package Strings;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String s1="Silent";
        String s2="listen";
        System.out.println(CheckAnagram(s1,s2));

    }
    private static boolean CheckAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        else {
            List<Character> l1 = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                l1.add(c);
            }
            List<Character> l2 = new ArrayList<>();
            for (int i = 0; i < s2.length(); i++) {
                char c = s1.charAt(i);
                l1.add(c);
            }
            if (l1.equals(l2)) {
                return true;
            }
        }
        return false;
    }
}
