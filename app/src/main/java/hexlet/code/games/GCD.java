package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {

    public static final int MAX_RANDOM = 100;
    private static int answerGCD;
    private static int expectedResultGCD;

    public static int getAnswerGCD() {
        return answerGCD;
    }

    public static int getExpectedResultGCD() {
        return expectedResultGCD;
    }

    public static void playGCD() {
        Engine.iterationOfGameGCD();
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void gameTaskGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void questionGameGCD() {

        int number1 = randomNumber();
        int number2 = randomNumber();

        expectedResultGCD = findGCD(number1, number2);
        System.out.println("Question: " + number1 + " " + number2);
    }

    public static void answerGameGCD() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        answerGCD = scanner.nextInt();
    }
}
