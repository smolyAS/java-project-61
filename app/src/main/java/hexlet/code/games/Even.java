package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {

    public static final int ROUNDS = 3;
    public static final int MAX_RANDOM = 100;

    public static void playEven() {

        Cli.greetingNewGamer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int numberOfQuestions = ROUNDS;
        String[] questions = new String[numberOfQuestions];
        String[] expectedAnswers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            String question = "Question: " + randomNumber();

            String expectedAnswer;
            if (randomNumber() % 2 == 0) {
                expectedAnswer = "yes";
            } else {
                expectedAnswer = "no";
            }

            questions[i] = question;
            expectedAnswers[i] = expectedAnswer;
        }

        Engine.run(questions, expectedAnswers);
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }
}
