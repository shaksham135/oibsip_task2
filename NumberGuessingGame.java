import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 20;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                int score = maxAttempts - attempts + 1;
                System.out.println("Your score is: " + score);
                break;
            } else if (guess < secretNumber) {
                System.out.println("The number is higher than your guess. Try again!");
            } else {
                System.out.println("The number is lower than your guess. Try again!");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts!");
            System.out.println("The correct number was: " + secretNumber);
        }

        scanner.close();
    }
}
