import java.math.BigInteger;

import static java.math.BigInteger.*;

public class SquaresOfFibonacci {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger result;
        if (n.equals(ZERO)) {
            result = ONE;
        } else if (n.equals(ONE)) {
            result = TWO;
        } else {
            BigInteger n2, n1 = ONE, n0 = ONE, sum = TWO, i = TWO;
            while (i.compareTo(n) <= 0) {
                n2 = n1;
                n1 = n0;
                n0 = n2.add(n1);
                sum = sum.add(n0);
                i = i.add(ONE);
            }
            result = sum;
        }
        return result.multiply(BigInteger.valueOf(4));
    }
}

// lessons learnt : the fact that the sum of the n first Fibonacci numbers is the (n+2) Fibonacci number minus one.
