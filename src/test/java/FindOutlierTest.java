import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindOutlierTest {

    @Test
    void shouldFindEven() {
        assertThat(FindOutlier.find(new int[]{1, -3, 4})).isEqualTo(4);
    }

    @Test
    void shouldFindOdd() {
        assertThat(FindOutlier.find(new int[]{2, -5, 8})).isEqualTo(-5);
    }

    @Test
    void givenTest() {
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertThat(FindOutlier.find(new int[]{2, 6, 8, -10, 3})).isEqualTo(3);
        assertThat(FindOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781})).isEqualTo(206847684);
        assertThat(FindOutlier.find(exampleTest3)).isEqualTo(0);
    }
}