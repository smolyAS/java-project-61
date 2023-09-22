package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static int answerCalc;
    public static int calculateExpression(int number1, int number2, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                result = 0;
                break;
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

        while (win < 3) {

            if (defeat > 0) {
                break;

            } else {

                int number1 = Engine.RandomNumber();
                int number2 = Engine.RandomNumber();
                char operator = Engine.RandomOperator();

                int expectedResult = calculateExpression(number1, number2, operator);

                System.out.println("Question: " + number1 + " " + operator + " " + number2);
                System.out.print("Your answer: ");

                int answerGamer = scanner.nextInt();
                answerCalc = answerGamer;

                if (answerCalc == expectedResult) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorCalc();
                    defeat++;
                }
            }

            if (win == 3) {
                Engine.gameOverCongratulation();
            }
        }
    }
}
