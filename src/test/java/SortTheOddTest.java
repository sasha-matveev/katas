import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTheOddTest {
    @Test
    void shouldSortEmpty() {
        Assertions.assertThat(SortTheOdd.sortArray(new int[]{})).isEmpty();
    }

    @Test
    void shouldWorkNoOdd() {
        Assertions.assertThat(SortTheOdd.sortArray(new int[]{2, 6, 4, 14})).containsExactly(2, 6, 4, 14);
    }

    @Test
    void shouldWorkOnlyOdd() {
        Assertions.assertThat(SortTheOdd.sortArray(new int[]{1, 13, 5, 3, 7})).containsExactly(1, 3, 5, 7, 13);
    }

    @Test
    void shouldWorkExample() {
        Assertions.assertThat(SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4})).containsExactly(1, 3, 2, 8, 5, 4);
        Assertions.assertThat(SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0})).containsExactly(1, 3, 5, 8, 0);
    }
}