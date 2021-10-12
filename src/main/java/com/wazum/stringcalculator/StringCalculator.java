package com.wazum.stringcalculator;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        String[] values = numbers.split(",");

        int number1 = 0;
        int number2 = 0;

        if (values.length > 0) {
            number1 = Integer.parseInt(values[0]);
        }
        if (values.length > 1) {
            number2 = Integer.parseInt(values[1]);
        }

        return number1 + number2;
    }
}
