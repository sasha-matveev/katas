import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongToIpTest {

    @Test
    void simpleCheck() {
        assertThat(LongToIp.longToIP(2154959208L)).isEqualTo("128.114.17.104");
    }

    @Test
    void examples() {
        assertThat(LongToIp.longToIP(0)).isEqualTo("0.0.0.0");
        assertThat(LongToIp.longToIP(2149583361L)).isEqualTo("128.32.10.1");
    }
}