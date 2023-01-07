package com.epam.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        try {
            return Double.parseDouble(str) > 0.0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}