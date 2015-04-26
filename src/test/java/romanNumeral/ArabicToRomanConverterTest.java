package romanNumeral;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class ArabicToRomanConverterTest {

    @Test public void should_return_1() {
        assertThat(RomanConverter.of("I").toArabic()).isEqualTo(1);
    }
    @Test public void should_return_2() {
        assertThat(RomanConverter.of("II").toArabic()).isEqualTo(2);
    }
    @Test public void should_return_3() {
        assertThat(RomanConverter.of("III").toArabic()).isEqualTo(3);
    }
    @Test public void should_return_4() {
        assertThat(RomanConverter.of("IV").toArabic()).isEqualTo(4);
    }
    @Test public void should_return_5() {
        assertThat(RomanConverter.of("V").toArabic()).isEqualTo(5);
    }
    @Test public void should_return_6() {
        assertThat(RomanConverter.of("VI").toArabic()).isEqualTo(6);
    }
    @Test public void should_return_999() {
        assertThat(RomanConverter.of("CMXCIX").toArabic()).isEqualTo(999);
    }
    @Test public void should_return_1999() {
        assertThat(RomanConverter.of("MCMXCIX").toArabic()).isEqualTo(1999);
    }
    @Test public void should_return_1990() {
        assertThat(RomanConverter.of("MCMXC").toArabic()).isEqualTo(1990);
    }
    @Test public void should_return_2015() {
        assertThat(RomanConverter.of("MMXV").toArabic()).isEqualTo(2015);
    }
    @Test public void should_return_2751() {
        assertThat(RomanConverter.of("MMDCCLI").toArabic()).isEqualTo(2751);
    }
    @Test public void should_return_3999() {
        assertThat(RomanConverter.of("MMMCMXCIX").toArabic()).isEqualTo(3999);
    }
}
