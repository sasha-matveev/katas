import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        AtomicInteger h = new AtomicInteger(Integer.MIN_VALUE);
        AtomicInteger l = new AtomicInteger(Integer.MAX_VALUE);
        Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .forEach(i -> {
                    h.accumulateAndGet(i, Math::max);
                    l.accumulateAndGet(i, Math::min);
                });
        return h.get() + " " + l.get();
    }
}
