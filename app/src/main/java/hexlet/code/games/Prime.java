package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {

    public static final int ROUNDS = 3;
    public static final int MAX_RANDOM = 100;
    private static int randomNum;

    public static void playPrime() {
        Cli.greetingNewGamer();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int numberOfQuestions = ROUNDS;
        String[] questions = new String[numberOfQuestions];
        String[] expectedAnswers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            String question = "Question: " + randomNumber();
            String expectedAnswer = checkPrimeNumber();

            questions[i] = question;
            expectedAnswers[i] = expectedAnswer;
        }

        Engine.run(questions, expectedAnswers);
    }

    public static int randomNumber() {
        randomNum = (int) (Math.random() * MAX_RANDOM);
        return randomNum;
    }

    public static String checkPrimeNumber() {
        int num = randomNum;
        if (num <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
