package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final int ROUNDS = 3;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;

    public static void playGCD() {
        Cli.greetingNewGamer();
        System.out.println("Find the greatest common divisor of given numbers.");

        int numberOfQuestions = ROUNDS;
        String[] questions = new String[numberOfQuestions];
        String[] expectedAnswers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            int number1 = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);
            int number2 = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);

            String question = "Question: " + number1 + " " + number2;
            String expectedAnswer = String.valueOf(findGCD(number1, number2));

            questions[i] = question;
            expectedAnswers[i] = expectedAnswer;
        }

        Engine.run(questions, expectedAnswers);
    }

    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
