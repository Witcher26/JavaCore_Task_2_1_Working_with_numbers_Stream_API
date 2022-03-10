package workWithNumbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = list.stream()
                .filter(w -> w > 0)
                .filter(w -> w % 2 == 0)
                .sorted(Comparator.naturalOrder());

        stream.forEach(System.out::println);
    }
}

