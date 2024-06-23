import java.util.Random;
import java.util.Scanner;

public class Guess_The_Number {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = ran.nextInt(100) + 1;

        int tryCount = 0;
        while (tryCount < 10) {
            System.out.print("Enter your guess (1-100): ");

            int playerGuess = sc.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("\nYou Win!!!");
                System.out.println("It took you " + tryCount + " tries.");

                if (tryCount == 1) {
                    System.out.println("***YOU ARE GOD***");
                } else if (tryCount <= 3) {
                    System.out.println("Excellent Performance.\nYou Get 5 Stars: *****");
                } else if (tryCount <= 6) {
                    System.out.println("Good Performance.\nYou Get 3 Stars: ***");
                } else {
                    System.out.println("Average Performance.\nYou Get 1 Star: *");
                }
            } else if (tryCount == 10) {
                System.out.println("\nOut of tries.\nYou have tried the maximum number of tries.");
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again.");
            } else {
                System.out.println("Nope! The number is lower. Guess again.");
            }

            if (playerGuess == randomNumber || tryCount == 10) {
                System.out.print("Do you want to play again (Y/N): ");
                String playAgain = sc.next();

                if (playAgain.equalsIgnoreCase("y")) {
                    tryCount = 0;
                    randomNumber = ran.nextInt(100) + 1;
                } else {
                    System.out.println("\nYou Quit.\nThanks For Playing...");
                    break;
                }
            }
        }

        sc.close();
    }
}
