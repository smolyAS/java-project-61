package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {

    public static final int MAX_WIN = 3;

    private static String userName;
    private static int answerGCD;
    private static int expectedResultGCD;

    public static int getAnswerGCD() {
        return answerGCD;
    }

    public static int getExpectedResultGCD() {
        return expectedResultGCD;
    }

    public static void playGCD() {
        Engine.iterationOfGameGCD();
    }

    public static void greetGameGCD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void questionGameGCD() {
        Scanner scanner = new Scanner(System.in);

        int number1 = Engine.randomNumber();
        int number2 = Engine.randomOperator();

        System.out.println("Question: " + number1 + " " + number2);
        System.out.print("Your answer: ");
        answerGCD = scanner.nextInt();
        expectedResultGCD = Engine.findGCD(number1, number2);
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gameOverErrorGCD() {
        System.out.print("'" + answerGCD + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was " + "'" + expectedResultGCD + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
