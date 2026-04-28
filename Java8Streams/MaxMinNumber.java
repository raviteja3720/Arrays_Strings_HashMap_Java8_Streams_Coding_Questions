package Java8Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 26, 3, 14, 5, 6, 17, 8, 9, 10};

        int maxNumber = Arrays.stream(numbers)
                .max()
                .orElse(0);
        System.out.println(maxNumber);


        List<Integer> numbers2 = Arrays.asList(1, 26, 3, 14, 5, 6, 17, 8, 9, 10);
        //Since it is Object Stream, we must use explicit comparator
        int minNumber = numbers2.stream()
//                .min(Integer::compare)
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(minNumber);

    }
}
