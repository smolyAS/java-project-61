package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static final int ROUNDS = 3;
    public static final int FIRST_NUM_PROGRESSION = 6;
    public static final int MIN_NUMBER_OF_INTEGER = 5;
    public static final int MAX_RANDOM = 100;
    public static final int MAX_STEP = 10;
    public static final int COEFF_STEP = 1;

    public static void playProgression() {

        Cli.greetingNewGamer();
        System.out.println("What number is missing in the progression?");

        int numberOfQuestions = ROUNDS;
        String[] questions = new String[numberOfQuestions];
        String[] expectedAnswers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            Random random = new Random();

            int length = random.nextInt(FIRST_NUM_PROGRESSION) + MIN_NUMBER_OF_INTEGER;
            int hiddenIndex = random.nextInt(length);
            int firstElement = random.nextInt(MAX_RANDOM);
            int step = random.nextInt(MAX_STEP) + COEFF_STEP;

            int[] progression = new int[length];
            for (int j = 0; j < length; j++) {
                progression[j] = firstElement + step * j;
            }
            int hiddenElement = progression[hiddenIndex];
            progression[hiddenIndex] = -1;
            String expectedAnswer = String.valueOf(hiddenElement);

            String question = "Question: ";
            for (int num : progression) {
                if (num == -1) {
                    System.out.print(".. ");
                } else {
                    System.out.print(num + " ");
                }
            }

            questions[i] = question;
            expectedAnswers[i] = expectedAnswer;
        }

        Engine.run(questions, expectedAnswers);
    }
}
