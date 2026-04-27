import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < secretNumber) System.out.println("Too low!");
            else if (guess > secretNumber) System.out.println("Too high!");
            else System.out.println("Correct! Attempts: " + attempts);
        }
    }
}
