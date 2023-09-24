package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Even.answer;
import static hexlet.code.Calc.answerCalc;
import static hexlet.code.Calc.expectedResult;
import static hexlet.code.GCD.answerGCD;
import static hexlet.code.GCD.expectedResultGCD;

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

    public static void gameOverError() {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static void gameOverErrorCalc() {
        System.out.println("'" + answerCalc + "'" + " is wrong answer ;(. Correct answer was " + "'" + expectedResult + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }

    public static int RandomNumber() {
        return (int) (Math.random() * 100);
    }

    public static char RandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    public static void gameOverErrorGCD() {
        System.out.println("'" + answerGCD + "'" + " is wrong answer ;(. Correct answer was " + "'" + expectedResultGCD + "'.");
        System.out.println("Let's try again, " + gamer + "!");
    }
}
