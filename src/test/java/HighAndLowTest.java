import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HighAndLowTest {

    @Test
    void shouldWork() {
        assertThat(HighAndLow.highAndLow("1")).isEqualTo("1 1");
        assertThat(HighAndLow.highAndLow("-1")).isEqualTo("-1 -1");
        assertThat(HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")).isEqualTo("42 -9");
        assertThat(HighAndLow.highAndLow("1 2 3")).isEqualTo("3 1");
        assertThat(HighAndLow.highAndLow("1 9 3 4 -5")).isEqualTo("9 -5");
    }
}