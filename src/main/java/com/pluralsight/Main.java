package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        float floatNumber = 0;
        double doubleNumber = 0;
        BigDecimal bigDecimal = BigDecimal.ZERO;

        for (int i = 0; i <= 10; i++) {
            floatNumber += 0.10;
            doubleNumber += 0.10;
           bigDecimal = bigDecimal.add(new BigDecimal("0.10"));
            System.out.println("Float: " + floatNumber + " Double: " + doubleNumber + " BigDecimal: "+bigDecimal);
            // they have small difference
            //Float: 1.1000001 Double: 1.0999999999999999 BigDecimal: 1.10
        }

        for (int i = 0; i <= 1000; i++) {
            floatNumber += 19.99;
            doubleNumber += 19.99;
            bigDecimal = bigDecimal.add(new BigDecimal("19.99"));
        }
        System.out.println("1000X");
        System.out.println("Float: " + floatNumber + " Double: " + doubleNumber + " BigDecimal: "+bigDecimal);
        // double and bigDecimal have small difference than float
        //Float: 20011.273 Double: 20011.090000000135 BigDecimal: 20011.09
    }
}
