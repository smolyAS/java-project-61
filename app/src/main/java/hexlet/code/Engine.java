package hexlet.code;

public class Engine {

    public static final int MAX_WIN = 3;

    public static void run(String[][] rounds) {

        int win = 0;
        int index = 0;

        while (win < MAX_WIN) {

            System.out.println(rounds[index][0]);
            System.out.print("Your answer: ");
            String answer = Cli.askAnswer();

            if (answer.equalsIgnoreCase(rounds[index][1])) {
                System.out.println("Correct!");
                win++;

            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + rounds[index][1] + ".");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
            index++;
        }
        if (win == MAX_WIN) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
