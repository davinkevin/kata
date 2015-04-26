package romanNumeral;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class Pair {
    Integer arabic;
    String roman;

    public Pair(Integer arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    public Integer arabic() {
        return arabic;
    }

    public String roman() {
        return roman;
    }
}
