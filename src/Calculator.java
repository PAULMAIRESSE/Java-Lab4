import java.util.ArrayList;

public class Calculator {

    public static double averageFromUserInput(String userInput) throws InputFormatException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        try {
            for (String number : userInput.split(" ")) {
                numbers.add(Integer.parseInt(number));
            }
        } catch (NumberFormatException e) {
            throw new InputFormatException("Input must be a list of numbers separated by spaces.");
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total / numbers.size();
    }
}
