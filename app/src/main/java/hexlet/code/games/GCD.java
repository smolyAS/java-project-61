package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    private static int answerGCD;

    public static int getAnswerGCD() {
        return answerGCD;
    }

    private static int expectedResultGCD;

    public static int getExpectedResultGCD() {
        return expectedResultGCD;
    }

    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
    public static void gameGCD() {
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("Find the greatest common divisor of given numbers.");

        int win = 0;
        int defeat = 0;

        while (win < Engine.MAX_WIN) {

            if (defeat > 0) {
                break;

            } else {

                int number1 = Engine.randomNumber();
                int number2 = Engine.randomOperator();

                System.out.println("Question: " + number1 + " " + number2);
                System.out.print("Your answer: ");

                answerGCD = scanner.nextInt();
                expectedResultGCD = findGCD(number1, number2);

                if (answerGCD == expectedResultGCD) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorGCD();
                    defeat++;
                }
            }

            if (win == Engine.MAX_WIN) {
                Engine.gameOverCongratulation();
            }
        }
    }
}
