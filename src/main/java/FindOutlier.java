import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        boolean mostlyOdds = Arrays.stream(integers)
                .limit(3)
                .map(i -> Math.abs(i % 2))
                .sum() >= 2;
        return Arrays.stream(integers)
                .parallel()
                .filter(i -> mostlyOdds == (i % 2 == 0))
                .findAny()
                .orElseThrow();
    }
}

