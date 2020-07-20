package gr.codhub.exercise1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AddFunctionality {
    //Adding big numbers using Bigdecimal
    public static BigDecimal addBig(double num1 , double num2 ) {
        BigDecimal big1 = new BigDecimal(String.valueOf(num1));
        BigDecimal big2 = new BigDecimal(String.valueOf(num2));
        BigDecimal result = big1.add(big2);
        return result;
    }

}

