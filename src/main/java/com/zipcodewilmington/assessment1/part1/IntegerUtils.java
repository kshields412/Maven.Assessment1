package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int total = 0;
        for(int i = 0; i <= n; i++){
            total += i;
        }
        return total;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int total = 1;
        for(int i = n; i > 0; i--){
            total = total * i;
        }
        return total;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reverseVal = 0;
        while (val > 0) {
            reverseVal = reverseVal * 10 + val % 10;
            val = val / 10;
        }
        return reverseVal;
    }
}
