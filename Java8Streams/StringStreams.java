package Java8Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringStreams {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob");
        names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList())
                .forEach(n -> System.out.println(n));

        Map<String, Long> grouped = names.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(grouped);


        List<String> words = Arrays.asList("apple", "banana", "apple");
        Map<String, Long> count = words.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(count);


        List<String> names2 = Arrays.asList("Alice", "Bob", "Annie", "Alex");
        List<String> startsWithA = names2.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(startsWithA);


        List<String> words2 = Arrays.asList("Java", "is", "awesome");
        String s = words2.stream().collect(Collectors.joining(" "));
        System.out.println(s);


        List<String> names3 = Arrays.asList("Charlie", "Alice", "Bob");
        List<String> revOrder=names3.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(revOrder);

        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go");
        String longestString = languages.stream()
                .max(Comparator.comparing(n->n.length()))
                .orElse("");
        System.out.println(longestString);


    }
}
