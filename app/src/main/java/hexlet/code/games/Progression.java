package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static int answerProgression;

    public static int getAnswerProgression() {
        return answerProgression;
    }

    private static int expectedResultProgression;

    public static int getExpectedResultProgression() {
        return expectedResultProgression;
    }

    public static void gameProgression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("What number is missing in the progression?");

        int win = 0;
        int defeat = 0;

        while (win < Engine.MAX_WIN) {

            if (defeat > 0) {
                break;
            } else {
                int length = random.nextInt(Engine.FIRST_NUM_PROGRESSION) + Engine.MIN_NUMBER_OF_INTEGER;
                int hiddenIndex = random.nextInt(length);
                int firstElement = random.nextInt(Engine.MAX_RANDOM);
                int step = random.nextInt(Engine.MAX_STEP) + Engine.COEFF_STEP;

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

                if (answerProgression == expectedResultProgression) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorProgression();
                    defeat++;
                }
            }
            if (win == Engine.MAX_WIN) {
                Engine.gameOverCongratulation();
            }
        }
    }
}

