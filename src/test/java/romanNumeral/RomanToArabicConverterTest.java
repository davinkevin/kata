package romanNumeral;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class RomanToArabicConverterTest {

    @Test public void should_return_I() {
        assertThat(RomanConverter.of(1).toRoman()).isEqualTo("I");
    }
    @Test public void should_return_II() {
        assertThat(RomanConverter.of(2).toRoman()).isEqualTo("II");
    }
    @Test public void should_return_III() {
        assertThat(RomanConverter.of(3).toRoman()).isEqualTo("III");
    }
    @Test public void should_return_IV() {
        assertThat(RomanConverter.of(4).toRoman()).isEqualTo("IV");
    }
    @Test public void should_return_V() {
        assertThat(RomanConverter.of(5).toRoman()).isEqualTo("V");
    }
    @Test public void should_return_VI() {
        assertThat(RomanConverter.of(6).toRoman()).isEqualTo("VI");
    }
    @Test public void should_return_IX() {
        assertThat(RomanConverter.of(9).toRoman()).isEqualTo("IX");
    }
    @Test public void should_return_X() {
        assertThat(RomanConverter.of(10).toRoman()).isEqualTo("X");
    }
    @Test public void should_return_CMXCIX() {
        assertThat(RomanConverter.of(999).toRoman()).isEqualTo("CMXCIX");
    }
    @Test public void should_return_MCMXCIX() {
        assertThat(RomanConverter.of(1999).toRoman()).isEqualTo("MCMXCIX");
    }
    @Test public void should_return_MCMXC() {
        assertThat(RomanConverter.of(1990).toRoman()).isEqualTo("MCMXC");
    }
    @Test public void should_return_MMXV() {
        assertThat(RomanConverter.of(2015).toRoman()).isEqualTo("MMXV");
    }
    @Test public void should_return_MMDCCLI() {
        assertThat(RomanConverter.of(2751).toRoman()).isEqualTo("MMDCCLI");
    }
    @Test public void should_return_MMMCMXCIX() {
        assertThat(RomanConverter.of(3999).toRoman()).isEqualTo("MMMCMXCIX");
    }

}
