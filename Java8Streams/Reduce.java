package Java8Streams;

import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer sum=numbers.stream()
                .reduce((a,b)->a+b)

                .orElse(-1);
        System.out.println(sum);

    }
}
