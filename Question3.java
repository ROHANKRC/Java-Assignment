/*Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit. */



import java.util.Scanner;

public class Question3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            // Displaying the menu
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Enter your Operation: ");
            
            // Reading the user's choice
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator...");
                break;  // Exit the loop if user chooses 5
            }

            // Input for the numbers
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            // Perform the operation based on the user's choice
            if (choice == 1) {
                System.out.println("Result: " + (num1 + num2));  // Addition
            } else if (choice == 2) {
                System.out.println("Result: " + (num1 - num2));  // Subtraction
            } else if (choice == 3) {
                System.out.println("Result: " + (num1 * num2));  // Multiplication
            } else if (choice == 4) {
                // Division check to prevent division by zero
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));  // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);  // Keep looping until the user chooses to exit

        input.close();  // Close the scanner to prevent resource leaks
    }
}
