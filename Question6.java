/*Write a program that accepts n integers from the user (where n is also
provided by the user). Store the numbers in an array and write a method
to find and display the second largest number in the array */


import java.util.Scanner;
import java.util.Arrays;

public class Question6 {

    // Method to find the second largest number in the array after sorting
    public static int findSecondLargest(int[] arr) {
        // Sort the array in descending order
        Arrays.sort(arr);

        // Return the second last element from the sorted array
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept number of integers (n)
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();

        // Edge case: If n is less than 2, second largest doesn't exist
        if (n < 2) {
            System.out.println("Please enter at least 2 integers to find the second largest.");
        }

        // Create an array to store the integers
        int[] arr = new int[n];

        // Accept n integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Find and print the second largest number
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest number is: " + secondLargest);

        input.close();  // Close the scanner
    }
}
