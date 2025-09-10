package edu.odu.cs.cs417;
/**
 * This is the main class that handles command-line arguments, validates input,
 * and calls the ConvertBase class to perform the conversion and display results.
 * It expects the first argument to be the base (an integer) and subsequent arguments
 * to be fractional numbers in base 10 (doubles) between 0 (inclusive) and 1 (exclusive).
 */


public class Main {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
      
        // Print the table header
       System.out.printf("| Base 10 | Base %d | %n", base);
       System.out.println("| :------ |  :---- |");
        
       // Process each command-line argument
       for(int i = 1; i < args.length; i++) {
        double num = Double.parseDouble(args[i]);
        if (num < 0 || num >= 1) {
            System.out.println("Number must be between 0 (inclusve) and 1 (exclusive).");
            break;
        }
        // Convert and print the number in base passed in args
        ConvertBase.convertBase(num, base);
    }
    
        
    
    }

    
}
