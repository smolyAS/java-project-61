package hexlet.code;

import java.util.Scanner;

public class Prime {
    public static String answerPrime;

    public static void gamePrime() {
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int win = 0;
        int defeat = 0;

        while (win < 3) {

            if (defeat > 0) {
                break;
            } else {
                boolean isPrime = true;
                int randomNum = Engine.randomNumber();
                System.out.println("Question: " + randomNum);
                System.out.print("Your answer: ");
                String answerGamer = scanner.next();
                answerPrime = answerGamer;

                if (randomNum > 1) {
                    for (int i = 2; i <= Math.sqrt(randomNum); i++) {
                        if (randomNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                } else {
                    isPrime = false;
                }

                if (answerGamer.equals("yes")) {
                    if (isPrime) {
                        Engine.gameWin();
                        win++;
                    } else {
                        Engine.gameOverAnswerYes();
                        defeat++;
                    }
                } else if (answerGamer.equals("no")) {
                    if (!isPrime) {
                        Engine.gameWin();
                        win++;
                    } else {
                        Engine.gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    Engine.gameOverErrorPrime();
                    defeat++;
                }
            }
        }
        if (win == 3) {
            Engine.gameOverCongratulation();
        }
    }
}

