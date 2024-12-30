package com.goodsoft.internship.Calculator;

/**
 * Implementation of the Calculator interface
 * for String class. This class performs simple
 * mathematical operations on objects of the String class.
 */
public class StringCalculator implements Calculator<String> {
    /**
     * {@return the result
     * of concatenation of two strings}
     *
     * @param str1 the first string
     * @param str2 the second string
     */
    @Override
    public String add(String str1, String str2) {
        return str1+str2;
    }

    /**
     * {@return the original string without
     * the first occurrence of the substring}
     * @param str1 the original string
     * @param str2 the substring
     */
    @Override
    public String substract(String str1, String str2) {
        if(str1.contains(str2))
            return str1.replaceFirst(str2,"");
        return str1;
    }

    /**
     * {@return string that contains as many
     * repetitions of the first string as
     * the length of the second string}
     *
     * @param str1 the first string
     * @param str2 the second string
     */
    @Override
    public String multiply(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<str2.length(); i++)
            str.append(str);
        return str.toString();
    }

    /**
     * {@return the original string without
     * all occurrences of the substring}
     *
     * @param str1 the original string
     * @param str2 the substring
     */
    @Override
    public String divide(String str1, String str2) {
        return str1.replace(str2, "");
    }
}
