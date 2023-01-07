package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {

    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args.isEmpty()) {
            return false;
        }
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}