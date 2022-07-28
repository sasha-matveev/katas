import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PeopleInTheBusKtTest {

    @Test
    internal fun `should work empty list`() {
        Assertions.assertThat(people(arrayOf())).isEqualTo(0)
    }

    @Test
    internal fun `should work zero people`() {
        Assertions.assertThat(people(arrayOf(0 to 0))).isEqualTo(0)
        Assertions.assertThat(people(arrayOf(0 to 0, 0 to 0))).isEqualTo(0)
    }

    @Test
    internal fun `should work equal in out`() {
        Assertions.assertThat(people(arrayOf(2 to 2, 3 to 3))).isEqualTo(0)
    }

    @Test
    internal fun `test examples`() {
        assertEquals(17, people(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10)))
        assertEquals(21, people(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8)))
        assertEquals(5, people(arrayOf(10 to 0,3 to 5,5 to 8)))
    }
}

