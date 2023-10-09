package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static final int MAX_WIN = 3;

    private static String userName;
    private static String answerPrime;
    private static int randomNumberInGamePrime;

    public static String getAnswerPrime() {
        return answerPrime;
    }

    public static void playPrime() {
        Engine.iterationOfGamePrime();
    }

    public static boolean checkPrimeNumber() {
        if (randomNumberInGamePrime <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(randomNumberInGamePrime); i++) {
            if (randomNumberInGamePrime % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void greetGamePrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void questionGamePrime() {
        Scanner scanner = new Scanner(System.in);

        randomNumberInGamePrime = Engine.randomNumber();
        System.out.println("Question: " + randomNumberInGamePrime);
        System.out.print("Your answer: ");
        answerPrime = scanner.next();
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gameOverAnswerNo() {
        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void gameOverAnswerYes() {
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void gameOverErrorPrime() {
        System.out.print("'" + answerPrime + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}


