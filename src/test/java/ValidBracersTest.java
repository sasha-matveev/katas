import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidBracersTest {
    private final ValidBracers vb = new ValidBracers();

    @Test
    void empty() {
        assertThat(vb.isValid("")).isTrue();
    }

    @Test
    void samples() {
        assertThat(vb.isValid("(){}[]")).isTrue();
        assertThat(vb.isValid("([{}])")).isTrue();
        assertThat(vb.isValid("(}")).isFalse();
        assertThat(vb.isValid("[(])")).isFalse();
        assertThat(vb.isValid("[({})](]")).isFalse();
    }

    @Test
    public void testValid() {
        assertThat(vb.isValid("()")).isTrue();
        assertThat(vb.isValid("{}")).isTrue();
        assertThat(vb.isValid("[]")).isTrue();

        assertThat(vb.isValid("([]{})")).isTrue();
        assertThat(vb.isValid("(()())")).isTrue();
        assertThat(vb.isValid("(({[]})([]))")).isTrue();
    }

    @Test
    public void testInvalid() {
        assertThat(vb.isValid("[(])")).isFalse();
        assertThat(vb.isValid("(({[]}))([]))")).isFalse();
    }
}