package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int ROUNDS = 3;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;
    private static int randomNum;

    public static void playEven() {

        Cli.greetingNewGamer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        randomNum = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);

        int numberOfQuestions = ROUNDS;
        String[] questions = new String[numberOfQuestions];
        String[] expectedAnswers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            String question = "Question: " + randomNum;
            String expectedAnswer = checkEvenNumber();

            questions[i] = question;
            expectedAnswers[i] = expectedAnswer;
        }

        Engine.run(questions, expectedAnswers);
    }

    public static String checkEvenNumber() {
        if (randomNum % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
