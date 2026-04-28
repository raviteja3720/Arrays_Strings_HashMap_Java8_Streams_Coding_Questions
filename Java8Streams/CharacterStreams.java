package Java8Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterStreams {
    public static void main(String[] args) {
        String s = "string data to count each character";
        //count charater using stream

        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //Find the frequency of each character in string

        String str="jashdjgsgxsagfc";

        String ch=Arrays.stream(str.split(""))
                .max(Comparator.comparing(n->n.length()))
                .orElse(null);
        System.out.println(ch);
    }
}
