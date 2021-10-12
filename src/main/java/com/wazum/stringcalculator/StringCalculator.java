package com.wazum.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        return split(numbers)
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static ArrayList<String> split(String numbers) {
        String[] splitNumbers = numbers.split(",");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitNumbers));

        return list;
    }
}
