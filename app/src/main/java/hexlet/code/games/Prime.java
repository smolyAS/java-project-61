package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static final int MAX_RANDOM = 100;
    private static String answerPrime;
    private static int randomNumberInGamePrime;

    public static String getAnswerPrime() {
        return answerPrime;
    }

    public static void playPrime() {
        Engine.iterationOfGamePrime();
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
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

    public static void gameTaskPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void questionGamePrime() {

        randomNumberInGamePrime = randomNumber();
        System.out.println("Question: " + randomNumberInGamePrime);
    }

    public static void answerGamePrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        answerPrime = scanner.next();
    }
}


