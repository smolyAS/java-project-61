package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
    public static final int MAX_WIN = 3;

    private static String answerEven;
    private static String userName;
    private static int randomNumberInGameEven;

    public static String getAnswerEven() {
        return answerEven;
    }

    public static int getRandomNumberInGameEven() {
        return randomNumberInGameEven;
    }

    public static void playEven() {
        Engine.iterationOfGameEven();
    }

    public static void greetGameEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void questionGameEven() {
        Scanner scanner = new Scanner(System.in);
        randomNumberInGameEven = Engine.randomNumber();
        System.out.println("Question: " + randomNumberInGameEven);
        System.out.print("Your answer: ");
        answerEven = scanner.next();
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

    public static void gameOverErrorEven() {
        System.out.print("'" + answerEven + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
