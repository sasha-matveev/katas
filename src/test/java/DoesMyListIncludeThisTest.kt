import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DoesMyListIncludeThisTest {
    @Test
    internal fun `test empty`() {
        assertThat(DoesMyListIncludeThis().include(intArrayOf(), 3)).isEqualTo(false)
    }

    @Test
    internal fun examples() {
        assertThat(DoesMyListIncludeThis().include(intArrayOf(1, 2, 3, 4), 2)).isEqualTo(true)
        assertThat(DoesMyListIncludeThis().include(intArrayOf(1, 2, 4, 5), 3)).isEqualTo(false)
    }

    @Test
    internal fun `test best`() {
        assertThat(DoesMyListIncludeThis().includeBest(intArrayOf(1, 2, 3), 2)).isEqualTo(true)
        assertThat(DoesMyListIncludeThis().includeBest(intArrayOf(1, 2, 3), 4)).isEqualTo(false)
    }

    @Test
    internal fun `test val`() {
        assertThat(DoesMyListIncludeThis().includeVal(intArrayOf(1, 2, 3), 2)).isEqualTo(true)
        assertThat(DoesMyListIncludeThis().includeVal(intArrayOf(1, 2, 3), 4)).isEqualTo(false)
    }
}