import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongToIp {
    public static String longToIP(long ip) {
        return IntStream.of(3, 2, 1, 0)
                .mapToObj(i -> String.valueOf((ip & 255L << 8 * i) >> 8 * i))
                .collect(Collectors.joining("."));
    }
}
