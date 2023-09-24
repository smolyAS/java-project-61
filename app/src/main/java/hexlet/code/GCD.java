package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static int answerGCD;
    public static int expectedResultGCD;

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

        while (win < 3) {

            if (defeat > 0) {
                break;

            } else {

                int number1 = Engine.RandomNumber();
                int number2 = Engine.RandomNumber();

                System.out.println("Question: " + number1 + " " + number2);
                System.out.print("Your answer: ");

                int answerGamer = scanner.nextInt();
                answerGCD = answerGamer;
                expectedResultGCD = findGCD(number1, number2);

                if (answerGCD == expectedResultGCD) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorGCD();
                    defeat++;
                }
            }

            if (win == 3) {
                Engine.gameOverCongratulation();
            }
        }
    }
}
