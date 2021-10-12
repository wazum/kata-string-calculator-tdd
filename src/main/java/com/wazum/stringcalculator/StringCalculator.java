package com.wazum.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public static int add(String numbers) {
        return split(clean(numbers))
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static String clean(String numbers) {
        return numbers.replaceAll("[^,\\d+]", "");
    }

    private static ArrayList<String> split(String numbers) {
        String[] splitNumbers = numbers.split(",");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitNumbers));
        list.removeIf(String::isBlank);

        return list;
    }
}
