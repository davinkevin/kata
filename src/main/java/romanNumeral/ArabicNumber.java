package romanNumeral;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class ArabicNumber extends Number{

    private Integer arabic;

    public ArabicNumber(Integer number) {
        this.arabic = number;
    }

    public String toRoman() {
        String roman = "";

        for (Pair pair : EQUIVALENCY_TABLE) {
            while (arabic >= pair.arabic()) {
                roman += pair.roman();
                arabic = arabic - pair.arabic();
            }
        }

        return roman;
    }
}
