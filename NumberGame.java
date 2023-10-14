
    import java.util.Random;
import java.util.Scanner;
    public class NumberGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 5;
            int roundsPlayed = 0;
            int totalAttempts = 0;
            int bestScore = Integer.MAX_VALUE;

            System.out.println(" Number Guessing Game!");

            boolean playA = true;
            while (playA) {
                int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                int attempts = 0;

                System.out.println("Round " + (roundsPlayed + 1));
                System.out.println("Guess the number between " + minRange + " and " + maxRange);

                boolean hasGuessed = false;
                while (attempts < maxAttempts && !hasGuessed) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == targetNumber) {
                        System.out.println("Congratulations You guessed the correct number in " + attempts + " attempts.");
                        hasGuessed = true;
                        if (attempts < bestScore) {
                            bestScore = attempts;
                        }
                    }
                    else if (userGuess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    }
                    else {
                        System.out.println("Too high! Try again.");
                    }
                }

                totalAttempts += attempts;
                roundsPlayed++;

                System.out.println("Round " + roundsPlayed + " summary:");
                System.out.println("The correct number was: " + targetNumber);
                System.out.println("Your attempts in this round: " + attempts);
                System.out.println("Best score so far: " + bestScore);

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainInput = scanner.next().toLowerCase();
                playA = playAgainInput.equals("yes");
            }

            System.out.println("Game Over!");
            System.out.println("Total rounds played: " + roundsPlayed);
            System.out.println("Total attempts: " + totalAttempts);
            System.out.println("Best score: " + bestScore);

            scanner.close();
        }
    }

