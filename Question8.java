/* Write a program that takes an integer input n and prints an inverted triangle of numbers.
 * For example, if n = 5, the output should be:

54321
4321
321
21
1
 */


import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept integer input for the number of rows
        System.out.print("Enter the number of rows (n): ");
        int n = input.nextInt();

        // Outer loop to print each row of the inverted triangle
        for (int i = n; i >= 1; i--) {
            // Inner loop to print numbers from 1 to i in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");  // Print number followed by a space
            }
            System.out.println();  // Move to the next line after each row
        }

        input.close();  // Close the scanner
    }
}

