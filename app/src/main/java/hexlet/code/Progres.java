package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progres {
    public static int answerProgression;
    public static int expectedResultProgression;

    public static int[] generateProgression() {
        int length = getRandomNumberInRange(5, 10);
        int[] progression = new int[length];

        int start = getRandomNumberInRange(1, 10);
        int difference = getRandomNumberInRange(1, 10);

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * difference;
        }

        return progression;
    }

    public static int generateHiddenNumber(int[] progression) {
        Random random = new Random();
        int hiddenIndex = random.nextInt(progression.length);

        return progression[hiddenIndex];
    }

    public static String getQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append("..");
            } else {
                question.append(progression[i]);
            }

            if (i != progression.length - 1) {
                question.append(" ");
            }
        }

        return question.toString();
    }

    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


    public static void gameProgression() {

        Scanner scanner = new Scanner(System.in);

        int[] progression = generateProgression();

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("What number is missing in the progression?");

        int win = 0;
        int defeat = 0;

        while (win < 3) {

            if (defeat > 0) {
                break;

            } else {

                for (int i = 0; i < progression.length; i++) {
                    System.out.println("Question: " + getQuestion(progression, i));
                    System.out.print("Your answer: ");
                    int answerGamer = scanner.nextInt();
                    answerProgression = answerGamer;
                    expectedResultProgression = generateHiddenNumber(progression);

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
}
