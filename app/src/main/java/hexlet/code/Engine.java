package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {

    public static final int MAX_WIN = 3;
    public static final int FIRST_NUM_PROGRESSION = 6;
    public static final int MIN_NUMBER_OF_INTEGER = 5;
    public static final int MAX_RANDOM = 100;
    public static final int MAX_STEP = 10;
    public static final int COEFF_STEP = 1;

    private static String gamer = "";

    public static void gameGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    public static void nameGamer() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        gamer = userName;
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + gamer + "!");
    }

    public static void gameOverAnswerNo() {
        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverAnswerYes() {
        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorEven() {
        System.out.println("'" + Even.getAnswerEven() + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorPrime() {
        System.out.println("'" + Prime.getAnswerPrime() + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorCalc() {
        System.out.println("'" + Calc.getAnswerCalc() + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was " + "'" + Calc.getExpectedResult() + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    public static void gameOverErrorGCD() {
        System.out.println("'" + GCD.getAnswerGCD() + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was " + "'" + GCD.getExpectedResultGCD() + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorProgression() {
        System.out.println("'" + Progression.getAnswerProgression() + "'" + " is wrong answer ;(.");
        System.out.print("Correct answer was " + "'" + Progression.getExpectedResultProgression() + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }
}
