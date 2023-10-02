package hexlet.code;

import java.util.Scanner;
import static hexlet.code.games.Even.answerEven;
import static hexlet.code.games.Prime.answerPrime;
import static hexlet.code.games.Calc.answerCalc;
import static hexlet.code.games.Calc.expectedResult;
import static hexlet.code.games.GCD.answerGCD;
import static hexlet.code.games.GCD.expectedResultGCD;
import static hexlet.code.games.Progression.answerProgression;
import static hexlet.code.games.Progression.expectedResultProgression;

public class Engine {
    public static String gamer = "";

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
        System.out.println("'" + answerEven + "'" + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorPrime() {
        System.out.println("'" + answerPrime + "'" + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorCalc() {
        System.out.println("'" + answerCalc + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was " + "'" + expectedResult + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100);
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    public static void gameOverErrorGCD() {
        System.out.println("'" + answerGCD + "'" + " is wrong answer ;(. ");
        System.out.print("Correct answer was " + "'" + expectedResultGCD + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorProgression() {
        System.out.println("'" + answerProgression + "'" + " is wrong answer ;(.");
        System.out.print("Correct answer was " + "'" + expectedResultProgression + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }
}
