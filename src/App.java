import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by spaces: ");
        String userInput = scanner.nextLine();
        scanner.close();
        try {
            double average = Calculator.averageFromUserInput(userInput);
            System.out.println("The average is: " + average);
        } catch (InputFormatException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}