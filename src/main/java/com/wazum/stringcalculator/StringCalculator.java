package com.wazum.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StringCalculator {
    public static int add(String numbers) {
        String delimiter = ",";
        Optional<String> firstLine = Arrays.stream(numbers.split("\\n")).findFirst();
        if (firstLine.isPresent() && firstLine.get().startsWith("//") && !firstLine.get().substring(2).isBlank()) {
            delimiter = firstLine.get().substring(2).trim();
        }

        return split(clean(numbers, delimiter), delimiter).stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static String clean(String numbers, String delimiter) {
        return numbers.replaceAll(String.format("[^%s\\n+\\d+]", delimiter), "");
    }

    private static ArrayList<String> split(String numbers, String delimiter) {
        String[] splitNumbers = numbers.split(String.format("[%s\\n]", delimiter));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitNumbers));
        list.removeIf(String::isBlank);

        return list;
    }
}
