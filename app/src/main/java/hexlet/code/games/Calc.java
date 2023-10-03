package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {

    private static int answerCalc;
    public static int getAnswerCalc() {
        return answerCalc;
    }

    private static int expectedResult;

    public static int getExpectedResult() {
        return expectedResult;
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

    public static void gameCalc() {
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("What is the result of the expression?");

        int win = 0;
        int defeat = 0;

        while (win < Engine.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                int number1 = Engine.randomNumber();
                int number2 = Engine.randomNumber();
                char operator = Engine.randomOperator();

                expectedResult = calculateExpression(number1, number2, operator);

                System.out.println("Question: " + number1 + " " + operator + " " + number2);
                System.out.print("Your answer: ");

                answerCalc = scanner.nextInt();

                if (answerCalc == expectedResult) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorCalc();
                    defeat++;
                }
            }

            if (win == Engine.MAX_WIN) {
                Engine.gameOverCongratulation();
            }
        }
    }
}
