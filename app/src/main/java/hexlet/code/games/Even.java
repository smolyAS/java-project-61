package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static final int MAX_RANDOM = 100;

    private static int questionEven;

    private static String answerEven;

    public static int getQuestionEven() {
        return questionEven;
    }

    public static String getAnswerEven() {
        return answerEven;
    }

    public static void playEven() {
        Engine.iterationOfGameEven();
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_RANDOM);
    }

    public static void gameTaskEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void questionGameEven() {
        questionEven = randomNumber();
        System.out.println("Question: " + questionEven);
    }

    public static void answerGameEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        answerEven = scanner.next();
    }
}
