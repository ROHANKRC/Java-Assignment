/* Implement a program that accepts an integer input n and prints Floyd's Triangle up to n rows.
 * Floyd's Triangle has consecutive numbers starting from 1. For example, if n = 4, the output should be:

for example: if user input(n)=4

1
2 3
4 5 6
7 8 9 10
 */





import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept integer input for the number of rows
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        int num = 1;  // Start from 1 for Floyd's Triangle

        // Outer loop to handle rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");  // Print the current number
                num++;  // Increment the number for the next time
            }
            System.out.println();  // Move to the next line after each row
        }

        scanner.close();  // Close the scanner
    }
}
