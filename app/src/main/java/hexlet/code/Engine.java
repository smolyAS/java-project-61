package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_WIN = 3;

    public static void run(String[] questions, String[] expectedAnswers) {

        int win = 0;
        int index = 0;

        while (win < MAX_WIN) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(questions[index]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(expectedAnswers[index])) {
                System.out.println("Correct!");
                win++;

            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + expectedAnswers[index] + ".");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }

//            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
//                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
//                System.out.println("Correct answer was 'yes' or 'no'.");
//                System.out.println("Let's try again, " + Cli.getUserName() + "!");
//                break;
//            }

            index++;
        }
        if (win == MAX_WIN) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
