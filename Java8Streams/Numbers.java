package Java8Streams;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<String> list = numbers.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .toList();
        System.out.println(list);

        //average
        Double average=numbers.stream()
                .mapToInt(n->n.intValue())
                .average()
                .orElse(-1);
        System.out.println(average);



        Integer findFirst = numbers.stream()
                .filter(n -> n > 10)
                .findFirst()
                .orElse(-1);
        System.out.println(findFirst);


        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        //boxed() is used to convert primitive types to Wrapper (objects) class
        Integer findThird=Arrays.stream(arr)
                .boxed()
                .skip(2)            //Skips first two elements
                .findFirst()
                .orElse(-1);
        System.out.println(findThird);

        Long count=Arrays.stream(arr)
                .count();
        System.out.println(count);
    }
}
