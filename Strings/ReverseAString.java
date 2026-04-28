package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "Leetcode";
        System.out.println("Reverse String: " + reverseString(input));
//        System.out.println("Reverse String: " + reverseStringUsingStringBuilder(str));
    }


    private static String reverseString(String str) {
        int size = str.length();
        String rev = "";
        for (int i = size-1; i >= 0; i--) {
            char c = str.charAt(i);
            rev = rev + c;
        }
        return rev;
    }

    private static StringBuilder reverseStringUsingStringBuilder(String str) {
        int size = str.length();
        StringBuilder rev = new StringBuilder();
        for (int i = size-1; i >= 0; i--) {
            char c = str.charAt(i);
            rev.append(c);
        }
        return rev;//.toString();
    }

}
