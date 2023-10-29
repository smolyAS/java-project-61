package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int ROUNDS = 3;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;

    public static void playEven() {
        Cli.greetingNewGamer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[][] rounds = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);
            String question = "Question: " + randomNum;
            String expectedAnswer = checkEvenNumber(randomNum) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = expectedAnswer;
        }

        Engine.run(rounds);
    }

    public static boolean checkEvenNumber(int number) {
        return number % 2 == 0;
    }
}
