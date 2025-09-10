package edu.odu.cs.cs417;

public class convertToBase2 {
    public static void convertToBase2(double num, int base) {
        final int MAXOUTPUTS = 8;
        double originalNum = num;
        int digitCount = 0;
        // Handle the case when the input number is 0
        if (num == 0) {
            System.out.println("|    0    |    0   |");
        }

        StringBuilder binary = new StringBuilder();
        // Convert the fractional part to binary
        // Limit the output to MAXOUTPUTS digits
        while (num > 0 && digitCount < MAXOUTPUTS) {
            num *= base;
            int digit = (int) num;
            binary.append(digit);
            num -= digit;
            digitCount++;

            if (num > 0) {
                binary.append(";");
            }
        }
        if (binary.charAt(binary.length() - 1) == ';') {
            binary.deleteCharAt(binary.length() - 1);
        }

        // Print the result in a formatted table
        System.out.printf("|   %.3f  |  0.%s  |%n", originalNum, binary.toString());

    }

}
