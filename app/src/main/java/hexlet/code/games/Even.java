package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static final int MAX_RANDOM = 100;

    public static void playEven() {

        Cli.greetingNewGamer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String expectedResult1;

        int randomNum = (int) (Math.random() * MAX_RANDOM);

        String question = String.valueOf(randomNum);
        System.out.println("Question: " + question);


        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.next();

        if (randomNum % 2 == 0) {
            expectedResult1 = "yes";
        } else {
            expectedResult1 = "no";
        }

        Engine.run(expectedResult1, answer1);

    }
}




//
//    public static int randomNumber() {
//        return (int) (Math.random() * MAX_RANDOM);
//    }

//    public static void playEven() {
//        Engine.iterationOfGameEven();
//    }



//    public static void gameTaskEven() {
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//    }
//
//    public static void questionGameEven() {
//        questionEven = randomNumber();
//        System.out.println("Question: " + questionEven);
//    }

//    public static void answerGameEven() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Your answer: ");
//        answerEven = scanner.next();
//    }
//
//    public static void gameWin() {
//        System.out.println("Correct!");
//    }
//
//    public static void gameOverCongratulation() {
//        System.out.println("Congratulations, " + userName + "!");
//    }
//
//    public static void gameOverAnswerNo() {
//        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
//        System.out.println("Let's try again, " + userName + "!");
//    }
//
//    public static void gameOverAnswerYes() {
//        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
//        System.out.println("Let's try again, " + userName + "!");
//    }
//
//    public static void gameOverErrorStringResult() {
//        System.out.print("'" + answerStr + "'" + " is wrong answer ;(. ");
//        System.out.println("Correct answer was 'yes' or 'no'.");
//        System.out.println("Let's try again, " + userName + "!");
//    }
//
//    public static void gameOverErrorIntResult() {
//        System.out.print("'" + answerInt + "'" + " is wrong answer ;(. ");
//        System.out.println("Correct answer was " + "'" + expectedResult + "'.");
//        System.out.println("Let's try again, " + userName + "!");
//    }
