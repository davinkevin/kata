package romanNumeral;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class RomanConverter {

    static ArabicNumber of(Integer number) {
        return new ArabicNumber(number);
    }
    static RomanNumber of(String roman) {
        return new RomanNumber(roman);
    }


}
