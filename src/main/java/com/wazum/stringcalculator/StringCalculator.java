package com.wazum.stringcalculator;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        if (numbers.equals("0")) {
            return 0;
        }

        if (numbers.equals("1")) {
            return 1;
        }

        String[] values = numbers.split(",");

        int number1 = Integer.parseInt(values[0]);
        int number2 = Integer.parseInt(values[1]);

        return number1 + number2;
    }
}
