package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= 3; i++) {

            int randomNum = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + randomNum);

            System.out.print("Your answer: ");
            String answerGamer = scanner.next();

            if (answerGamer.equals("yes")) {
                if (randomNum % 2 == 0) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                }
            } else if (answerGamer.equals("no")) {
                if (randomNum % 2 != 0) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                }
            } else {
                System.out.println("'" + answerGamer + "'" + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
                System.out.println("Let's try again, " + userName + "!");
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}