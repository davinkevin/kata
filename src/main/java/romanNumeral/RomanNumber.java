package romanNumeral;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class RomanNumber extends Number{

    private String roman;

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public Integer toArabic() {
        Integer arabic = 0;

        for (Pair pair : EQUIVALENCY_TABLE) {
            while (roman.startsWith(pair.roman())) {
                arabic += pair.arabic();
                roman = roman.substring(pair.roman().length());
            }
        }

        return arabic;
    }

}
