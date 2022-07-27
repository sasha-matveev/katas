import java.util.stream.IntStream;

public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        return IntStream.range(2, (int) (Math.sqrt(num) + 1)).parallel().filter(x -> num % x == 0).findAny().isEmpty();
    }
}
