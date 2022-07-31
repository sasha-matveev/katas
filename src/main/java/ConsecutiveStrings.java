import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        return k <= 0 || k > strarr.length ? "" : IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparing(str -> str.length()))
                .orElse("");
    }
}
