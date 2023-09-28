package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static int answerProgression;
    public static int expectedResultProgression;
    public static void gameProgression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("What number is missing in the progression?");

        int win = 0;
        int defeat = 0;

        while (win < 3) {

            if (defeat > 0) {
                break;
            } else {
                int length = random.nextInt(6) + 5;
                int hiddenIndex = random.nextInt(length);
                int firstElement = random.nextInt(100);
                int step = random.nextInt(10) + 1;

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
                int answerGamer = scanner.nextInt();
                answerProgression = answerGamer;
                expectedResultProgression = hiddenElement;

                if (answerProgression == expectedResultProgression) {
                    Engine.gameWin();
                    win++;
                } else {
                    Engine.gameOverErrorProgression();
                    defeat++;
                }
            }
            if (win == 3) {
                Engine.gameOverCongratulation();
            }
        }
    }
}

