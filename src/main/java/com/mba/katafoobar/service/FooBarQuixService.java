package com.mba.katafoobar.service;

public class FooBarQuixService {

    private static final String BAR = "Bar";
    private static final String FOO = "Foo";
    private static final String QUIX = "Quix";

    /*
    Rules :
        if the number is divisible by 3 or contains 3, replace 3 by "Foo";
        if the number is divisible by 5 or contains 5, replace 5 by "Bar";
        if the number contains 7, replace 7 by "Quix".
        Divisors have high predecence, the content is analyzed in the order of appearance.
        If no match, return the input number as a string.

     */
    public static String numberToString(String number){
        StringBuilder result = new StringBuilder();
        if (Integer.parseInt(number) % 3 == 0) result.append(FOO);
        if (Integer.parseInt(number) % 5 == 0) result.append(BAR);
        for (int j = 0; j < number.length(); j++) {
            if (number.charAt(j) == '3') result.append(FOO);
            if (number.charAt(j) == '5') result.append(BAR);
            if (number.charAt(j) == '7') result.append(QUIX);
        }
        return result.length() == 0 ? number : result.toString();
    }
}
