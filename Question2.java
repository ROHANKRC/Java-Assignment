/* Create a program that accepts 10 integers from the user, stores them in
an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime. */

import java.util.Scanner;
public class Question2{

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i < number; i++) { // Check divisibility from 2 to number - 1
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true; // Number is prime if no divisors found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array to store the 10 integers
        int[] numbers = new int[10];
        
        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Print only the prime numbers from the array
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        input.close();
    }
}
