package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static final int MAX_WIN = 3;

    private static int answerCalc;
    private static String userName;
    private static int expectedResult;

    public static int getAnswerCalc() {
        return answerCalc;
    }

    public static int getExpectedResult() {
        return expectedResult;
    }

    public static void playCalc() {
        Engine.iterationOfGameCalc();
    }

    public static int calculateExpression(int number1, int number2, char operator) {
        int result;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else {
            result = 0;
        }
        return result;
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    public static void greetGameCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
    }

    public static void questionGameCalc() {
        Scanner scanner = new Scanner(System.in);

        int number1 = Engine.randomNumber();
        int number2 = Engine.randomNumber();
        char operator = randomOperator();

        expectedResult = calculateExpression(number1, number2, operator);
        System.out.println("Question: " + number1 + " " + operator + " " + number2);
        System.out.print("Your answer: ");
        answerCalc = scanner.nextInt();
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gameOverErrorCalc() {
        System.out.print("'" + answerCalc + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was " + "'" + expectedResult + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
