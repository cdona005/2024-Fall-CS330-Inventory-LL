package edu.odu.cs.cs417;

import static edu.odu.cs.cs417.convertToBase2.convertToBase2;

public class main {
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
        convertToBase2(num, base);
    }
    
        
    
    }

    
}
