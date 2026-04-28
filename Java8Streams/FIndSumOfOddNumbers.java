package Java8Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FIndSumOfOddNumbers {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        List<Integer> numbers2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list =numbers2.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);


        int sum= Arrays.stream(numbers).filter(n->n%2!=0).sum();
        System.out.println(sum);

    }
}
