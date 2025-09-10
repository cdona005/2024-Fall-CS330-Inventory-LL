package edu.odu.cs.cs417;

/**
 * This class provides a method to convert a fractional number from base 10 to another base.
 * It handles the conversion of the fractional part and formats the output in a table.
 * The conversion is limited to a maximum of 8 digits in the output.
 * input: double num, int base
 * output: formatted string showing the number in base 10 and its representation in the specified base
 */
public class ConvertBase {
    public static void convertBase(double num, int base) {
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
            // Increment the digit count to ensure ; are not counted as digits in output
            digitCount++;
            // append a ; if there are more digits to come
            if (num > 0) {
                binary.append(";");
            }
        }
        // Remove the trailing ; if it exists
        if (binary.charAt(binary.length() - 1) == ';') {
            binary.deleteCharAt(binary.length() - 1);
        }

        // Print the result in a formatted table
        System.out.printf("|   %.3f  |  0.%s  |%n", originalNum, binary.toString());

    }

}
