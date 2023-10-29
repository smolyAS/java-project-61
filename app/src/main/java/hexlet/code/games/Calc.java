package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int ROUNDS = 3;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;

    public static void playCalc() {
        Cli.greetingNewGamer();
        System.out.println("What is the result of the expression?");

        String[][] rounds = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {

            int number1 = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);
            int number2 = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);
            char operator = randomOperator();

            String question = "Question: " + number1 + " " + operator + " " + number2;
            String expectedAnswer = String.valueOf(calculateExpression(number1, number2, operator));

            rounds[i][0] = question;
            rounds[i][1] = expectedAnswer;
        }

        Engine.run(rounds);
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
}
