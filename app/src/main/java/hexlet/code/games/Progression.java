package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static final int MAX_WIN = 3;
    public static final int FIRST_NUM_PROGRESSION = 6;
    public static final int MIN_NUMBER_OF_INTEGER = 5;
    public static final int MAX_RANDOM = 100;
    public static final int MAX_STEP = 10;
    public static final int COEFF_STEP = 1;
    private static String userName;
    private static int answerProgression;
    private static int expectedResultProgression;

    public static int getAnswerProgression() {
        return answerProgression;
    }

    public static int getExpectedResultProgression() {
        return expectedResultProgression;
    }

    public static void playProgression() {
        Engine.iterationOfGameProgression();
    }

    public static void greetGameProgression() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");
    }

    public static void questionGameProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int length = random.nextInt(FIRST_NUM_PROGRESSION) + MIN_NUMBER_OF_INTEGER;
        int hiddenIndex = random.nextInt(length);
        int firstElement = random.nextInt(MAX_RANDOM);
        int step = random.nextInt(Engine.MAX_STEP) + COEFF_STEP;

        int[] progression = new int[length];
        for (int j = 0; j < length; j++) {
            progression[j] = firstElement + step * j;
        }
        int hiddenElement = progression[hiddenIndex];
        progression[hiddenIndex] = -1;

        System.out.print("Question: ");
        for (int num : progression) {
            if (num == -1) {
                System.out.print(".. ");
            } else {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Your answer: ");
        answerProgression = scanner.nextInt();
        expectedResultProgression = hiddenElement;
    }

    public static void gameWin() {
        System.out.println("Correct!");
    }

    public static void gameOverCongratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gameOverErrorProgression() {
        System.out.print("'" + answerProgression + "'" + " is wrong answer ;(.");
        System.out.println("Correct answer was " + "'" + expectedResultProgression + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}

