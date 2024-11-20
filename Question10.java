/* Take a string input from the user and a character to search for. Write a method to count the occurrences
 * of the character in the string and return the count. Then display the count to the user.
 */


import java.util.Scanner;

public class Question10 {

    // Method to count occurrences of a character in a string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;

        // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Accept character input from the user
        System.out.print("Enter the character to search for: ");
        char characterToSearch = scanner.next().charAt(0);

        // Call the method to count occurrences
        int count = countCharacterOccurrences(inputString, characterToSearch);

        // Display the count to the user
        System.out.println("The character '" + characterToSearch + "' appears " + count + " times in the String.");

        scanner.close();  // Close the scanner
    }
}
