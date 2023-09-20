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

        var win = 0;
        var defeat = 0;

        while (win < 3) {

            if (defeat > 0) {
                break;
            } else {

                int randomNum = (int) (Math.random() * 100) + 1;
                System.out.println("Question: " + randomNum);

                System.out.print("Your answer: ");
                String answerGamer = scanner.next();

                if (answerGamer.equals("yes")) {
                    if (randomNum % 2 == 0) {
                        System.out.println("Correct!");
                        win++;
                    } else {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.println("Let's try again, " + userName + "!");
                        defeat++;
                    }
                } else if (answerGamer.equals("no")) {
                    if (randomNum % 2 != 0) {
                        System.out.println("Correct!");
                        win++;
                    } else {
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again, " + userName + "!");
                        defeat++;
                    }
                } else {
                    System.out.println("'" + answerGamer + "'" + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    defeat++;
                }
            }
        }
        if (win == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}