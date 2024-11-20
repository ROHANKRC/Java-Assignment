/*  Write a Java program that takes an integer input from the user and
calculates the factorial of the number. Then, write a method to calculate
the sum of the digits of this factorial. For example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3). */

import java.util.Scanner;

public class Question1{

    // Method to calculate factorial using a simple loop
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;  // Multiply result by i for each iteration
        }
        return result;
    }

    // Method to calculate sum of digits of the number
    public static int sumOfDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Calculate the factorial
        long factorial = factorial(number);
        
        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        // Calculate the sum of digits of the factorial
        int sum = sumOfDigits(factorial);
        
        // Print the sum of digits
        System.out.println("Sum of digits of " + factorial + " is: " + sum);

        input.close();
        
    
    }
}
