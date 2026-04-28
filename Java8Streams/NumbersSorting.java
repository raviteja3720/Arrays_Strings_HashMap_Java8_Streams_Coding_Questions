package Java8Streams;

import java.util.*;

public class NumbersSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> sortedNumbersAsc=numbers.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(sortedNumbersAsc);

        List<Integer> sortedNumbersDesc=numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedNumbersDesc);
    }
}
