package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int ROUNDS = 3;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;

    public static void playPrime() {
        Cli.greetingNewGamer();
        System.out.println(RULES);

        String[][] rounds = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.getRandomInt(MIN_RANDOM, MAX_RANDOM);
            String question = "Question: " + randomNum;
            String expectedAnswer = checkPrimeNumber(randomNum) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = expectedAnswer;
        }

        Engine.run(rounds);
    }

    public static boolean checkPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
