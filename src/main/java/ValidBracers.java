import java.util.function.Function;

public class ValidBracers {

    public boolean isValid(String braces) {
        try {
            expectValidAndAfter(braces, s -> s.isEmpty());
        } catch (NonValidException e) {
            return false;
        }
        return true;
    }

    private String expectValidAndAfter(String str, Function<String, Boolean> check) throws NonValidException {
        String remain = str;
        while (!check.apply(remain)) {
            remain = expectValid(remain);
        }
        return remain;
    }

    private String expectValid(String str) throws NonValidException {
        if (str.startsWith("(")) {
            return expectValidAndAfter(str.substring(1), s -> s.startsWith(")")).substring(1);
        }
        if (str.startsWith("{")) {
            return expectValidAndAfter(str.substring(1), s -> s.startsWith("}")).substring(1);
        }
        if (str.startsWith("[")) {
            return expectValidAndAfter(str.substring(1), s -> s.startsWith("]")).substring(1);
        }
        throw new NonValidException();
    }

    private static final class NonValidException extends Exception {
    }

}
