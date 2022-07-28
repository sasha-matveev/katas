import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfFibonacciTest {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), SquaresOfFibonacci.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), SquaresOfFibonacci.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), SquaresOfFibonacci.perimeter(BigInteger.valueOf(30)));
    }

    @Test
    void shouldCalculateSmallNumbers() {
        Assertions.assertThat(SquaresOfFibonacci.perimeter(BigInteger.valueOf(0))).isEqualTo(4);
        Assertions.assertThat(SquaresOfFibonacci.perimeter(BigInteger.valueOf(1))).isEqualTo(8);
        Assertions.assertThat(SquaresOfFibonacci.perimeter(BigInteger.valueOf(2))).isEqualTo(16);
    }

    @Test
    void shouldCalculateBigNumbers() {
        Assertions.assertThat(SquaresOfFibonacci.perimeter(BigInteger.valueOf(46135))).isNotNull();
    }
}