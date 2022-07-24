import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TribonacciTest {

    private final Tribonacci t = new Tribonacci();

    @Test
    void shouldWork() {
        assertThat(t.tribonacci(arr(0, 0, 1), 0)).hasSize(0);
        assertThat(t.tribonacci(arr(0, 1, 2), 0)).hasSize(0);

        assertThat(t.tribonacci(arr(0, 1, 2), 1)).hasSize(1).containsExactly(0);
        assertThat(t.tribonacci(arr(0, 1, 2), 2)).hasSize(2).containsExactly(0, 1);
        assertThat(t.tribonacci(arr(0, 1, 2), 3)).hasSize(3).containsExactly(0, 1, 2);

        assertThat(t.tribonacci(arr(1, 1, 1), 10)).hasSize(10).containsExactly(1, 1, 1, 3, 5, 9, 17, 31, 57, 105);
        assertThat(t.tribonacci(arr(0, 0, 1), 10)).hasSize(10).containsExactly(0, 0, 1, 1, 2, 4, 7, 13, 24, 44);
        assertThat(t.tribonacci(arr(0, 1, 1), 10)).hasSize(10).containsExactly(0, 1, 1, 2, 4, 7, 13, 24, 44, 81);
    }

    private static double[] arr(double... ds) {
        return ds;
    }
}