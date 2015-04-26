package romanNumeral;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 26/04/15 for Kata
 */
public class Number {

    protected static final List<Pair> EQUIVALENCY_TABLE = new ArrayList<Pair>();
    static {
        EQUIVALENCY_TABLE.add(new Pair(1000,  "M"));
        EQUIVALENCY_TABLE.add(new Pair(900,  "CM"));
        EQUIVALENCY_TABLE.add(new Pair(500,   "D"));
        EQUIVALENCY_TABLE.add(new Pair(400,  "CD"));
        EQUIVALENCY_TABLE.add(new Pair(100,   "C"));
        EQUIVALENCY_TABLE.add(new Pair( 90,  "XC"));
        EQUIVALENCY_TABLE.add(new Pair( 50,   "L"));
        EQUIVALENCY_TABLE.add(new Pair( 40,  "XL"));
        EQUIVALENCY_TABLE.add(new Pair( 10,   "X"));
        EQUIVALENCY_TABLE.add(new Pair(  9,  "IX"));
        EQUIVALENCY_TABLE.add(new Pair(  5,   "V"));
        EQUIVALENCY_TABLE.add(new Pair(  4,  "IV"));
        EQUIVALENCY_TABLE.add(new Pair(  1,   "I"));
    }
}
