package Java8Streams;

import java.util.List;
import java.util.stream.Stream;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        List<Double> randomNumbers= Stream.generate(()->Math.random())
                .limit(5)
                .toList();
        System.out.println(randomNumbers);
    }
}
