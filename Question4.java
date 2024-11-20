/*Accept a string input from the user and check if it’s a palindrome (a word
that reads the same forwards and backwards). Create a method to
reverse the string and compare it to the original to determine if it’s a
palindrome. */


import java.util.Scanner;

public class Question4{

    // Method to reverse the string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character in reverse order
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept string input from the user
        System.out.print("Enter a string: ");
        String original = input.nextLine();  // Read the input string

        // Call the method to reverse the string
        String reversed = reverseString(original);

        // Check if the original string is equal to the reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        input.close();  // Close the scanner
    }
}
