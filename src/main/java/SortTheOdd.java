import java.util.*;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        return Smart.sortArray(array);
    }

    @SuppressWarnings("unused")
    private static final class My {
        public static int[] sortArray(int[] array) {
            List<Integer> idxs = new ArrayList<>();
            List<Integer> odds = new ArrayList<>();
            IntStream.range(0, array.length)
                    .filter(i -> array[i] % 2 != 0)
                    .forEach(i -> {
                        idxs.add(i);
                        odds.add(array[i]);
                    });
            Collections.sort(odds);
            IntStream.range(0, idxs.size()).forEach(i -> array[idxs.get(i)] = odds.get(i));
            return array;
        }
    }

    private static final class Smart {
        public static int[] sortArray(int[] array) {
            Iterator<Integer> intIterator = IntStream.of(array)
                    .filter(v -> v % 2 == 1)
                    .sorted()
                    .iterator();
            return IntStream.of(array)
                    .map(v -> v % 2 == 0 ? v : intIterator.next())
                    .toArray();
        }
    }
}
