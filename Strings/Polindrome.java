package Strings;

public class Polindrome {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(checkPolindrome(input));
        System.out.println(isPolidrome(input));
    }

    public static String checkPolindrome(String str) {
        StringBuilder polin = new StringBuilder();
        int size = str.length();
        for (int i = size - 1; i >= 0; i--) {
            char c = str.charAt(i);
            polin.append(c);
        }
//        System.out.println(polin);
        if (str.contentEquals(polin)) {
            return "Given String: " + str + " is a Polindrome";
        } else {
            return "Given String: " + str + " is not a Polindrome";
        }
    }

    public static boolean isPolidrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
