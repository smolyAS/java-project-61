package hexlet.code;

import java.util.Scanner;

public class Even {
    public static String answerEven;
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);

        Engine.gameGreet();
        Engine.nameGamer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int win = 0;
        int defeat = 0;

        while (win < 3) {

            if (defeat > 0) {
                break;
            } else {

                int randomNum = Engine.randomNumber();
                System.out.println("Question: " + randomNum);

                System.out.print("Your answer: ");
                String answerGamer = scanner.next();
                answerEven = answerGamer;

                if (answerGamer.equals("yes")) {
                    if (randomNum % 2 == 0) {
                        Engine.gameWin();
                        win++;
                    } else {
                        Engine.gameOverAnswerYes();
                        defeat++;
                    }
                } else if (answerGamer.equals("no")) {
                    if (randomNum % 2 != 0) {
                        Engine.gameWin();
                        win++;
                    } else {
                        Engine.gameOverAnswerNo();
                        defeat++;
                    }
                } else {
                    Engine.gameOverErrorEven();
                    defeat++;
                }
            }
        }
        if (win == 3) {
            Engine.gameOverCongratulation();
        }
    }
}
