/*Write a program that takes an integer input n and prints a pyramid of
numbers up to n rows, where each row has an increasing count of
numbers. For example, if n = 4, the output should be:
example:n=4
1
12
123
1234
*/

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept integer input for number of rows
        System.out.print("Enter the number of rows (n): ");
        int n = input.nextInt();

        // Loop to print each row of the pyramid
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  // Print number followed by a space
            }
            System.out.println();  // Move to the next line after each row
        }

        input.close();  // Close the scanner
    }
}
