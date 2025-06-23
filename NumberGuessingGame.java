import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rdm = new Random();

        int numberToGuess = rdm.nextInt(100) + 1; // Random number between 1 and 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have guessed a number between 1 and 100.");

        int userGuess;

        System.out.println("Choose your dufficulty level: ");
        System.out.println("1 for Easy (10 attempts)");
        System.out.println("2 for Medium (5 attempts)");
        System.out.println("3 for Hard (3 attempts)");

        int difficulty = sc.nextInt();

        switch(difficulty) {
            case 1: for( int i=10; i>=0; i--) {
                System.out.println("You have " + i + " attempts left.");
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    return;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Incorrect The answer is Higher than " + userGuess);
                } else {
                    System.out.println("Incorrect The answer is Lower than " + userGuess);
                }
            }
            break;
            case 2: for( int i=5; i>=0; i--) {
                System.out.println("You have " + i + " attempts left.");
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    return;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Incorrect The answer is Higher than " + userGuess);
                } else {
                    System.out.println("Incorrect The answer is Lower than " + userGuess);
                }
            }
            break;
            case 3: for( int i=3; i>=0; i--) {
                System.out.println("You have " + i + " attempts left.");
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    return;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Incorrect The answer is Higher than " + userGuess);
                } else {
                    System.out.println("Incorrect The answer is Lower than " + userGuess);
                }
            }
        }
    }
}