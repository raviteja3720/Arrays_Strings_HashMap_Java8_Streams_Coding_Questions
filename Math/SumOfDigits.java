package Math;

import java.util.HashMap;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 5415;
        int sum = 0;
        while (num > 0) {
            int last = num % 10;  //remainder
            sum = sum + last;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
