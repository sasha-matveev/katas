import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ConsecutiveStringsTest {

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2)).isEqualTo("abigailtheta");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1)).isEqualTo("oocccffuucccjjjkkkjyyyeehh");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {}, 3)).isEqualTo("");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2)).isEqualTo("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2)).isEqualTo("wlwsasphmxxowiaxujylentrklctozmymu");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2)).isEqualTo("");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3)).isEqualTo("ixoyx3452zzzzzzzzzzzz");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15)).isEqualTo("");
        Assertions.assertThat(ConsecutiveStrings.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0)).isEqualTo("");
    }

}