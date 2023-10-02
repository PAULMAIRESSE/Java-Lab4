import java.util.ArrayList;

public class Calculator {

    public static double averageFromUserInput(String userInput) throws InputFormatException {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Create an ArrayList object
        try {
            for (String number : userInput.split(" ")) { // Split user input by spaces and loop through each number
                numbers.add(Integer.parseInt(number)); // Add number to ArrayList
            }
        } catch (NumberFormatException e) { // Catch NumberFormatException if user input is not a number
            throw new InputFormatException("Input must be a list of numbers separated by spaces.");
        }

        // Calculate sum
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        // Return average
        return total / numbers.size();
    }
}
