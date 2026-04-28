package Java8Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Unique_Duplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 14, 4, 5, 48, 2, 8);

        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println(numbers.stream().collect(Collectors.toSet()));

        Set<Integer> duplicates = new HashSet<>();
        numbers.stream()
                .filter(n -> !duplicates.add(n))
                .forEach(n -> System.out.println(n));
    }
}
