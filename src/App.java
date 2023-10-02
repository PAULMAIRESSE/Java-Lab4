import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a list of numbers separated by spaces: "); // Ask user input
        String userInput = scanner.nextLine(); // Read user input
        scanner.close(); // Close scanner
        try {
            double average = Calculator.averageFromUserInput(userInput); // Call averageFromUserInput method
            System.out.println("The average is: " + average); // Print average
        } catch (InputFormatException e) {
            System.out.println(e.getMessage()); // Print error message
            return;
        }
    }
}