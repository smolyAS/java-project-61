package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static final int MAX_RANDOM = 100;

    private static int answerCalc;
    private static int expectedResultCalc;

    public static int getAnswerCalc() {
        return answerCalc;
    }

    public static int getExpectedResultCalc() {
        return expectedResultCalc;
    }

    public static void playCalc() {
        Engine.iterationOfGameCalc();
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
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

    public static void gameTaskCalc() {
        System.out.println("What is the result of the expression?");
    }

    public static void questionGameCalc() {

        int number1 = randomNumber();
        int number2 = randomNumber();
        char operator = randomOperator();

        expectedResultCalc = calculateExpression(number1, number2, operator);
        System.out.println("Question: " + number1 + " " + operator + " " + number2);
    }

    public static void answerGameCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        answerCalc = scanner.nextInt();
    }
}
