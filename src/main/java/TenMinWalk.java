public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int[] broken = new int[2];
        for (char c : walk) {
            if (c == 'n') {
                broken[0]++;
            } else if (c == 'w') {
                broken[1]++;
            } else if (c == 'e') {
                broken[1]--;
            } else if (c == 's') {
                broken[0]--;
            } else {
                throw new IllegalArgumentException(c + " not expected");
            }
        }
        for (int b : broken) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
