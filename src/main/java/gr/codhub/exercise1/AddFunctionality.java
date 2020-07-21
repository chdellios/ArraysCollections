package gr.codhub.exercise1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class AddFunctionality {
    //Adding big numbers using BigInteger
    public static ArrayList<Integer> addBig(double num1, double num2) {
        BigInteger big1 = new BigInteger(String.valueOf(((int) num1)));
        BigInteger big2 = new BigInteger(String.valueOf(((int) num2)));
        BigInteger result = big1.add(big2);
//adding BigInteger result in a arraylsit digit by digit
        ArrayList<Integer> biglist = new ArrayList<>();
        BigInteger prev1 = new BigInteger("10");
        while (result.intValue() != 0) {
            biglist.add(0, result.mod(prev1).intValue());
            result = result.divide(prev1);
        }

        Collections.reverse(biglist);
        return biglist;
    }

}

