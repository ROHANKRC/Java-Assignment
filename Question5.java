/*Write a program that takes an integer input n and stores the first n terms
of the Fibonacci sequence in an array. Then, print the array. For example,
if the user enters 7, store and display the first 7 terms of the Fibonacci
sequence: 0, 1, 1, 2, 3, 5, 8. */



import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept integer input for number of terms
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();  

        // check for non-positive input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            
        }

        // Initialize the first two terms of Fibonacci
        int a = 0, b = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");  // Print the current term
            int nextTerm = a + b;  // Calculate next term
            a = b;  // Update a to the previous b
            b = nextTerm;  // Update b to the next term
        }

        input.close();  // Close the scanner
    }
}
