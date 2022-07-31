import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SquaredStrings1Test {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed Tests vertMirror")
        var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
        var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
        testing(SquaredStrings1.oper(SquaredStrings1::vertMirror, s), r)

        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"
        testing(SquaredStrings1.oper(SquaredStrings1::vertMirror, s), r)

        println("Fixed Tests horMirror")
        s = "lVHt\nJVhv\nCSbg\nyeCt"
        r = "yeCt\nCSbg\nJVhv\nlVHt"
        testing(SquaredStrings1.oper(SquaredStrings1::horMirror, s), r)

        s = "njMK\ndbrZ\nLPKo\ncEYz"
        r = "cEYz\nLPKo\ndbrZ\nnjMK"
        testing(SquaredStrings1.oper(SquaredStrings1::horMirror, s), r)

    }
}