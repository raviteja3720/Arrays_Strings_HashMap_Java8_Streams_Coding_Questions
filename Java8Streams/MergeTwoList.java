package Java8Streams;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.StreamSupport.stream;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> mergedList= Stream.of(list1, list2)
                .flatMap(n->n.stream())
                .toList();
        System.out.println(mergedList);

        List<Integer> mergedList2=Stream
                .concat(list1.stream(), list2.stream())
                .toList();
        System.out.println(mergedList2);
    }
}
